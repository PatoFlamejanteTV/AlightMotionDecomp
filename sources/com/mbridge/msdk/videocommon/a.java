package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24187a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24188b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24189c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24190d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24191e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24192f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24193g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24194h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24195i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0440a> f24196j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0440a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f24197a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24198b;

        public final WindVaneWebView a() {
            return this.f24197a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f24197a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f24198b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f24197a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f24197a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.f24198b = z8;
        }
    }

    public static C0440a a(String str) {
        if (f24193g.containsKey(str)) {
            return f24193g.get(str);
        }
        if (f24194h.containsKey(str)) {
            return f24194h.get(str);
        }
        if (f24195i.containsKey(str)) {
            return f24195i.get(str);
        }
        if (f24196j.containsKey(str)) {
            return f24196j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f24193g.containsKey(str)) {
            f24193g.remove(str);
        }
        if (f24195i.containsKey(str)) {
            f24195i.remove(str);
        }
        if (f24194h.containsKey(str)) {
            f24194h.remove(str);
        }
        if (f24196j.containsKey(str)) {
            f24196j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f24193g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f24193g.remove(str2);
                }
            }
        } else {
            f24193g.clear();
        }
        f24194h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0440a> entry : f24193g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f24193g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0440a> entry : f24194h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f24194h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0440a c0440a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                f24194h.put(str, c0440a);
                return;
            } else {
                f24193g.put(str, c0440a);
                return;
            }
        }
        if (z9) {
            f24196j.put(str, c0440a);
        } else {
            f24195i.put(str, c0440a);
        }
    }

    public static void b(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0440a> concurrentHashMap = f24188b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0440a> concurrentHashMap2 = f24191e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i8 != 287) {
                if (i8 != 288) {
                    ConcurrentHashMap<String, C0440a> concurrentHashMap3 = f24187a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0440a> concurrentHashMap4 = f24190d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0440a> concurrentHashMap5 = f24189c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0440a> concurrentHashMap6 = f24192f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a() {
        f24195i.clear();
        f24196j.clear();
    }

    public static C0440a a(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 != 94) {
                if (i8 != 287) {
                    if (i8 != 288) {
                        ConcurrentHashMap<String, C0440a> concurrentHashMap = f24187a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f24187a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0440a> concurrentHashMap2 = f24190d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f24190d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0440a> concurrentHashMap3 = f24189c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f24189c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0440a> concurrentHashMap4 = f24192f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f24192f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0440a> concurrentHashMap5 = f24188b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f24188b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0440a> concurrentHashMap6 = f24191e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f24191e.get(requestIdNotice);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i8, String str, C0440a c0440a) {
        try {
            if (i8 == 94) {
                if (f24191e == null) {
                    f24191e = new ConcurrentHashMap<>();
                }
                f24191e.put(str, c0440a);
            } else if (i8 == 287) {
                if (f24192f == null) {
                    f24192f = new ConcurrentHashMap<>();
                }
                f24192f.put(str, c0440a);
            } else if (i8 != 288) {
                if (f24187a == null) {
                    f24187a = new ConcurrentHashMap<>();
                }
                f24187a.put(str, c0440a);
            } else {
                if (f24190d == null) {
                    f24190d = new ConcurrentHashMap<>();
                }
                f24190d.put(str, c0440a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(int i8, String str, C0440a c0440a) {
        try {
            if (i8 == 94) {
                if (f24188b == null) {
                    f24188b = new ConcurrentHashMap<>();
                }
                f24188b.put(str, c0440a);
            } else {
                if (i8 != 287) {
                    return;
                }
                if (f24189c == null) {
                    f24189c = new ConcurrentHashMap<>();
                }
                f24189c.put(str, c0440a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
