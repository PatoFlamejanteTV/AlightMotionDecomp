package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SupportSQLiteQueryBuilder {
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private Object[] bindArgs;
    private String[] columns;
    private boolean distinct;
    private String groupBy;
    private String having;
    private String limit;
    private String orderBy;
    private String selection;
    private final String table;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SupportSQLiteQueryBuilder builder(String tableName) {
            AbstractC3292y.i(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, AbstractC3284p abstractC3284p) {
        this(str);
    }

    private final void appendClause(StringBuilder sb, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            sb.append(str);
            sb.append(str2);
        }
    }

    private final void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr[i8];
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    public static final SupportSQLiteQueryBuilder builder(String str) {
        return Companion.builder(str);
    }

    public final SupportSQLiteQueryBuilder columns(String[] strArr) {
        this.columns = strArr;
        return this;
    }

    public final SupportSQLiteQuery create() {
        String str;
        String str2 = this.groupBy;
        if ((str2 == null || str2.length() == 0) && (str = this.having) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause".toString());
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.distinct) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.columns;
        if (strArr != null && strArr.length != 0) {
            AbstractC3292y.f(strArr);
            appendColumns(sb, strArr);
        } else {
            sb.append("* ");
        }
        sb.append("FROM ");
        sb.append(this.table);
        appendClause(sb, " WHERE ", this.selection);
        appendClause(sb, " GROUP BY ", this.groupBy);
        appendClause(sb, " HAVING ", this.having);
        appendClause(sb, " ORDER BY ", this.orderBy);
        appendClause(sb, " LIMIT ", this.limit);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return new SimpleSQLiteQuery(sb2, this.bindArgs);
    }

    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    public final SupportSQLiteQueryBuilder groupBy(String str) {
        this.groupBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder having(String str) {
        this.having = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder limit(String limit) {
        AbstractC3292y.i(limit, "limit");
        boolean matches = limitPattern.matcher(limit).matches();
        if (limit.length() == 0 || matches) {
            this.limit = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    public final SupportSQLiteQueryBuilder orderBy(String str) {
        this.orderBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder selection(String str, Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }
}
