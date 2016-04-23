package ${pkg};

import ${thriftPkg}.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import rx.Observable;
import rx.schedulers.Schedulers;


/**
 * Description : DON'T EDIT IF UNNECESSARY !
 *
 * @author ${author}  ${date}.
 */
public class ${className} {

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

    <#list services as service>


    public static Builder ber4${service};
    private ${service}.Client ${service}Client = null;

    /**
     * ${service} interface
     *
     * @param <T> the type of you want to return
     */
    interface ${service}Action<T extends Object> {
        T op(${service}.Client client) throws TException;
    }

    <T> Observable.OnSubscribe<T> sub4${service} (${service}Action<T> action) {
        return subscriber -> {
            try {
                transport = new TSocket(ber4${service}.host, ber4${service}.port, ber4${service}.TIME_OUT);
                protocol = new TBinaryProtocol(transport);
                ${service}Client = new ${service}.Client(protocol);
                transport.open();
                subscriber.onNext(action.op(${service}Client));
            } catch (Exception e) {
                subscriber.onError(e);
            }
            subscriber.onCompleted();
        };
    }
    </#list>
}
