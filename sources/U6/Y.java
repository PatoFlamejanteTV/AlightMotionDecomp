package U6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Y extends C1447c {

    /* renamed from: o, reason: collision with root package name */
    private final Socket f10182o;

    public Y(Socket socket) {
        AbstractC3292y.i(socket, "socket");
        this.f10182o = socket;
    }

    @Override // U6.C1447c
    protected void B() {
        Logger logger;
        Logger logger2;
        try {
            this.f10182o.close();
        } catch (AssertionError e8) {
            if (L.e(e8)) {
                logger2 = M.f10153a;
                logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f10182o, (Throwable) e8);
                return;
            }
            throw e8;
        } catch (Exception e9) {
            logger = M.f10153a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f10182o, (Throwable) e9);
        }
    }

    @Override // U6.C1447c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
