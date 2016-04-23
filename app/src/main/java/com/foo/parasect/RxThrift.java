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
 * @author Parasect.jar  Sat Apr 23 12:00:58 CST 2016.
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



    public static Builder ber4SerOne;
    private SerOne.Client SerOneClient = null;

    /**
     * SerOne interface
     *
     * @param <T> the type of you want to return
     */
    interface SerOneAction<T extends Object> {
        T op(SerOne.Client client) throws TException;
    }

    <T> Observable.OnSubscribe<T> sub4SerOne (SerOneAction<T> action) {
        return subscriber -> {
            try {
                transport = new TSocket(ber4SerOne.host, ber4SerOne.port, ber4SerOne.TIME_OUT);
                protocol = new TBinaryProtocol(transport);
                SerOneClient = new SerOne.Client(protocol);
                transport.open();
                subscriber.onNext(action.op(SerOneClient));
            } catch (Exception e) {
                subscriber.onError(e);
            }
            subscriber.onCompleted();
        };
    }


    public static Builder ber4SerTwo;
    private SerTwo.Client SerTwoClient = null;

    /**
     * SerTwo interface
     *
     * @param <T> the type of you want to return
     */
    interface SerTwoAction<T extends Object> {
        T op(SerTwo.Client client) throws TException;
    }

    <T> Observable.OnSubscribe<T> sub4SerTwo (SerTwoAction<T> action) {
        return subscriber -> {
            try {
                transport = new TSocket(ber4SerTwo.host, ber4SerTwo.port, ber4SerTwo.TIME_OUT);
                protocol = new TBinaryProtocol(transport);
                SerTwoClient = new SerTwo.Client(protocol);
                transport.open();
                subscriber.onNext(action.op(SerTwoClient));
            } catch (Exception e) {
                subscriber.onError(e);
            }
            subscriber.onCompleted();
        };
    }
}
