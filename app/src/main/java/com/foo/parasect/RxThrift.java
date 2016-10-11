package com.foo.parasect;

import com.foo.thrift.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import rx.Observable;
import rx.schedulers.Schedulers;


/**
 * Description : DON'T EDIT IF UNNECESSARY !
 *
 * @author Parasect.jar  Tue Oct 11 17:15:56 CST 2016.
 */
public class RxThrift {

    public static class Builder {

        String host = null;
        int port = -1;
        String session = null;
        int TIME_OUT = 10000;

        public Builder(String host, int port) {
            this.host = host;
            this.port = port;
        }

        public Builder setSession(String session) {
            this.session = session;
            return this;
        }
    }

    private TTransport transport = null;
    private TBinaryProtocol protocol = null;

    /**
     * generate observable
     *
     * @return Observable ...
     */
    <T> Observable<T> toObservable(Observable.OnSubscribe<T> subscribe) {

        return Observable
                .create(subscribe)
                .subscribeOn(Schedulers.io())
                .doAfterTerminate(() -> {
                    if (null != transport && transport.isOpen()) {
                        transport.close();
                    }
                });
    }



    public static Builder ber4UserService;
    private UserService.Client UserServiceClient = null;

    /**
     * UserService interface
     *
     * @param <T> the type of you want to return
     */
    interface UserServiceAction<T extends Object> {
        T op(UserService.Client client) throws TException;
    }

    <T> Observable.OnSubscribe<T> sub4UserService (UserServiceAction<T> action) {
        return subscriber -> {
            try {
                transport = new TSocket(ber4UserService.host, ber4UserService.port, ber4UserService.TIME_OUT);
                protocol = new TBinaryProtocol(transport);
                UserServiceClient = new UserService.Client(protocol);
                transport.open();
                subscriber.onNext(action.op(UserServiceClient));
            } catch (Exception e) {
                subscriber.onError(e);
            }
            subscriber.onCompleted();
        };
    }
}
