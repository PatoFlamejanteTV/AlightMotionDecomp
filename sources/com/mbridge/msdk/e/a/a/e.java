package com.mbridge.msdk.e.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.foundation.download.Command;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class e {
    public static b.a a(m mVar) {
        boolean z8;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = mVar.f20054c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a9 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i8 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z8 = false;
            j8 = 0;
            j9 = 0;
            while (i8 < split.length) {
                String trim = split[i8].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j8 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j9 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z8 = true;
                }
                i8++;
            }
            i8 = 1;
        } else {
            z8 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = map.get("Expires");
        long a10 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long a11 = str4 != null ? a(str4) : 0L;
        String str5 = map.get(Command.HTTP_HEADER_ETAG);
        if (i8 != 0) {
            j11 = currentTimeMillis + (j8 * 1000);
            if (z8) {
                j12 = j11;
            } else {
                Long.signum(j9);
                j12 = (j9 * 1000) + j11;
            }
            j10 = j12;
        } else {
            j10 = 0;
            if (a9 <= 0 || a10 < a9) {
                j11 = 0;
            } else {
                j11 = currentTimeMillis + (a10 - a9);
                j10 = j11;
            }
        }
        b.a aVar = new b.a();
        aVar.f20019a = mVar.f20053b;
        aVar.f20020b = str5;
        aVar.f20024f = j11;
        aVar.f20023e = j10;
        aVar.f20021c = a9;
        aVar.f20022d = a11;
        aVar.f20025g = map;
        aVar.f20026h = mVar.f20055d;
        return aVar;
    }

    private static SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private static long a(String str) {
        try {
            Date parse = b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e8) {
            if (!MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str) && !"-1".equals(str)) {
                aa.a(e8, "Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                aa.a("Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j8) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<com.mbridge.msdk.e.a.i> a(List<com.mbridge.msdk.e.a.i> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.e.a.i> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.mbridge.msdk.e.a.i> list2 = aVar.f20026h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.e.a.i iVar : aVar.f20026h) {
                    if (!treeSet.contains(iVar.a())) {
                        arrayList.add(iVar);
                    }
                }
            }
        } else if (!aVar.f20025g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f20025g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.e.a.i(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] split = str.split(";", 0);
            for (int i8 = 1; i8 < split.length; i8++) {
                String[] split2 = split[i8].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
