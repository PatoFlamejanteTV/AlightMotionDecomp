package com.mbridge.msdk.newreward.function.c.a;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.i;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.b.c;
import com.mbridge.msdk.newreward.function.c.d;
import com.mbridge.msdk.newreward.function.c.e;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a extends com.mbridge.msdk.newreward.function.c.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f22142a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.function.c.a.a$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22143a;

        static {
            int[] iArr = new int[e.values().length];
            f22143a = iArr;
            try {
                iArr[e.CHECK_IS_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22143a[e.CHECK_CAMPAIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22143a[e.HANDLER_ALREADY_INSTALL_CAMPAIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22143a[e.CREATE_OFFSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22143a[e.CREATE_DAILY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22143a[e.CREATE_BIDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22143a[e.SHOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22143a[e.CHECK_IS_REQUEST_CONTROL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22143a[e.UPDATE_CAM_TOKEN_RULE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22143a[e.START_LOAD_CHECK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22143a[e.CANDIDATE_LOAD_ACTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22143a[e.REQ_SETTING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22143a[e.REQ_CAMPAIGN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22143a[e.REQ_DOWN_CAMPAIGN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22143a[e.RESTORE_DB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22143a[e.SMART_LOAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22143a[e.NORMAL_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22143a[e.PRE_HANDLE_LOAD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22143a[e.UNIT_INIT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.newreward.function.c.a
    public final d a(com.mbridge.msdk.newreward.function.c.b bVar) {
        List<CampaignEx> a9;
        com.mbridge.msdk.newreward.function.f.a x8;
        d dVar = new d();
        switch (AnonymousClass1.f22143a[bVar.a().ordinal()]) {
            case 1:
                dVar.a(((com.mbridge.msdk.newreward.a.e) bVar.b()).x().c());
                break;
            case 2:
                Map map = (Map) bVar.b();
                try {
                    ((com.mbridge.msdk.newreward.a.e) map.get("adapter_model")).x().b((com.mbridge.msdk.newreward.function.d.a.b) map.get("campaign"));
                    dVar.a(true);
                    break;
                } catch (MBridgeError e8) {
                    dVar.a(false);
                    dVar.a(e8);
                    break;
                }
            case 3:
                Map map2 = (Map) bVar.b();
                ((com.mbridge.msdk.newreward.a.e) map2.get("adapter_model")).x().c((com.mbridge.msdk.newreward.function.d.a.b) map2.get("campaign"));
                break;
            case 4:
                a(bVar, dVar, TypedValues.CycleType.S_WAVE_OFFSET);
                break;
            case 5:
                a(bVar, dVar, "daily");
                break;
            case 6:
                a(bVar, dVar, "bridge_ids");
                break;
            case 7:
                new i().a(bVar);
                break;
            case 8:
                g gVar = (g) c.a().b(e.CHECK_IS_REQUEST_CONTROL);
                if (gVar != null) {
                    try {
                        dVar.a(gVar.a(bVar.b()));
                        break;
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        break;
                    }
                }
                break;
            case 9:
                if (((l) c.a().b(e.UPDATE_CAM_TOKEN_RULE)) != null) {
                    try {
                        Object b9 = bVar.b();
                        Map map3 = null;
                        Map map4 = b9 instanceof Map ? (Map) b9 : null;
                        if (map4 != null) {
                            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) map4.get("adapter_model");
                            com.mbridge.msdk.newreward.function.f.a x9 = ((com.mbridge.msdk.newreward.a.e) map4.get("queue_first_adapter_model")).x();
                            if (x9 != null && (a9 = x9.a()) != null && a9.size() != 0) {
                                String encryptPrice = a9.get(0).getEncryptPrice();
                                if (!TextUtils.isEmpty(encryptPrice) && (x8 = eVar.x()) != null && x8.a() != null && x8.a().size() != 0) {
                                    List<CampaignEx> a10 = eVar.x().a();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("encrypt_p=", "encrypt_p=" + encryptPrice);
                                    hashMap.put("irlfa=", "irlfa=1");
                                    for (CampaignEx campaignEx : a10) {
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            if (campaignEx != null) {
                                                campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                                                campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll(str, str2));
                                            }
                                        }
                                    }
                                    map3 = map4;
                                }
                            }
                        }
                        dVar.a(map3);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        break;
                    }
                }
                break;
            case 10:
                ((com.mbridge.msdk.newreward.function.c.b.a.c) c.a().b(e.START_LOAD_CHECK)).a(bVar.b());
                break;
            case 11:
                dVar.a(((com.mbridge.msdk.newreward.function.c.b.a.a) c.a().b(e.CANDIDATE_LOAD_ACTION)).a(bVar.b()));
                break;
        }
        return dVar;
    }

    private void a(com.mbridge.msdk.newreward.function.c.b bVar, d dVar, String str) {
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.a.b bVar2 = new com.mbridge.msdk.newreward.function.c.b.a.b();
        Map map = (Map) bVar.b();
        if (map == null) {
            map = new HashMap();
        }
        map.put("obj_map", this.f22142a);
        map.put("result", dVar);
        map.put("type", str);
        bVar2.a(map);
    }

    @Override // com.mbridge.msdk.newreward.function.c.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        com.mbridge.msdk.newreward.a.e eVar = bVar.b() instanceof com.mbridge.msdk.newreward.a.e ? (com.mbridge.msdk.newreward.a.e) bVar.b() : null;
        switch (AnonymousClass1.f22143a[bVar.a().ordinal()]) {
            case 12:
                if (eVar == null) {
                    new com.mbridge.msdk.newreward.function.f.e().a(com.mbridge.msdk.newreward.function.g.b.a().a(bVar, bVar.a()), bVar2);
                    return;
                } else {
                    eVar.r().a(com.mbridge.msdk.newreward.function.g.b.a().a(bVar, bVar.a()), bVar2);
                    return;
                }
            case 13:
                com.mbridge.msdk.newreward.a.e eVar2 = (com.mbridge.msdk.newreward.a.e) ((Map) bVar.b()).get("adapter_model");
                eVar2.x().a(eVar2, com.mbridge.msdk.newreward.function.g.b.a().a(bVar.b(), bVar.a()), bVar2);
                return;
            case 14:
                Map<? extends String, ? extends Object> map = (Map) bVar.b();
                com.mbridge.msdk.newreward.a.e eVar3 = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
                com.mbridge.msdk.newreward.function.d.a.b bVar3 = (com.mbridge.msdk.newreward.function.d.a.b) map.get("campaign");
                bVar3.F().putAll(map);
                eVar3.y().a(bVar3, bVar2);
                return;
            case 15:
                c.a().a(e.RESTORE_DB).a(bVar, bVar2);
                return;
            case 16:
                bVar.b();
                c.a().a(e.SMART_LOAD).a(bVar, bVar2);
                return;
            case 17:
                com.mbridge.msdk.newreward.function.c.b.a.d dVar = (com.mbridge.msdk.newreward.function.c.b.a.d) c.a().a(e.NORMAL_LOAD);
                dVar.a(this);
                dVar.a(bVar, bVar2);
                return;
            case 18:
                c.a().a(e.PRE_HANDLE_LOAD).a(bVar, bVar2);
                return;
            case 19:
                c.a().a(e.UNIT_INIT).a(bVar, bVar2);
                return;
            default:
                return;
        }
    }
}
