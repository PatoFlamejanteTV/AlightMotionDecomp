package C;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f646c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f647d = 7;

    /* renamed from: e, reason: collision with root package name */
    private static final a f648e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f649f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f650g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f651h;

    /* renamed from: i, reason: collision with root package name */
    private static final a f652i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f653j;

    /* renamed from: k, reason: collision with root package name */
    private static final a f654k;

    /* renamed from: l, reason: collision with root package name */
    private static final List f655l;

    /* renamed from: a, reason: collision with root package name */
    private final int f656a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f657b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: C.O
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.q(sQLiteDatabase);
            }
        };
        f648e = aVar;
        a aVar2 = new a() { // from class: C.P
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.r(sQLiteDatabase);
            }
        };
        f649f = aVar2;
        a aVar3 = new a() { // from class: C.Q
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f650g = aVar3;
        a aVar4 = new a() { // from class: C.S
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.u(sQLiteDatabase);
            }
        };
        f651h = aVar4;
        a aVar5 = new a() { // from class: C.T
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.v(sQLiteDatabase);
            }
        };
        f652i = aVar5;
        a aVar6 = new a() { // from class: C.U
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f653j = aVar6;
        a aVar7 = new a() { // from class: C.V
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.B(sQLiteDatabase);
            }
        };
        f654k = aVar7;
        f655l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(Context context, String str, int i8) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.f657b = false;
        this.f656a = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void E(SQLiteDatabase sQLiteDatabase, int i8) {
        p(sQLiteDatabase);
        F(sQLiteDatabase, 0, i8);
    }

    private void F(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        List list = f655l;
        if (i9 <= list.size()) {
            while (i8 < i9) {
                ((a) f655l.get(i8)).a(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i9 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void p(SQLiteDatabase sQLiteDatabase) {
        if (!this.f657b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f646c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f657b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        E(sQLiteDatabase, this.f656a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        E(sQLiteDatabase, i9);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        p(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        p(sQLiteDatabase);
        F(sQLiteDatabase, i8, i9);
    }
}
