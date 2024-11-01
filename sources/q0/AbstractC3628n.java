package q0;

import Q.AbstractC1396p;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: q0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3628n {
    public static Object a(Task task) {
        AbstractC1396p.j();
        AbstractC1396p.h();
        AbstractC1396p.m(task, "Task must not be null");
        if (task.m()) {
            return h(task);
        }
        q qVar = new q(null);
        i(task, qVar);
        qVar.c();
        return h(task);
    }

    public static Object b(Task task, long j8, TimeUnit timeUnit) {
        AbstractC1396p.j();
        AbstractC1396p.h();
        AbstractC1396p.m(task, "Task must not be null");
        AbstractC1396p.m(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return h(task);
        }
        q qVar = new q(null);
        i(task, qVar);
        if (qVar.e(j8, timeUnit)) {
            return h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Executor executor, Callable callable) {
        AbstractC1396p.m(executor, "Executor must not be null");
        AbstractC1396p.m(callable, "Callback must not be null");
        N n8 = new N();
        executor.execute(new O(n8, callable));
        return n8;
    }

    public static Task d(Exception exc) {
        N n8 = new N();
        n8.q(exc);
        return n8;
    }

    public static Task e(Object obj) {
        N n8 = new N();
        n8.r(obj);
        return n8;
    }

    public static Task f(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            N n8 = new N();
            s sVar = new s(collection.size(), n8);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                i((Task) it2.next(), sVar);
            }
            return n8;
        }
        return e(null);
    }

    public static Task g(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return f(Arrays.asList(taskArr));
        }
        return e(null);
    }

    private static Object h(Task task) {
        if (task.n()) {
            return task.j();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.i());
    }

    private static void i(Task task, r rVar) {
        Executor executor = AbstractC3627m.f36634b;
        task.f(executor, rVar);
        task.d(executor, rVar);
        task.a(executor, rVar);
    }
}
