package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.AbstractC2163i3;
import com.google.android.gms.internal.measurement.AbstractC2172j3;
import com.google.android.gms.internal.measurement.C2094a6;
import com.google.android.gms.internal.measurement.C2122d7;
import com.google.android.gms.internal.measurement.C2131e7;
import com.google.android.gms.internal.measurement.C2139f6;
import com.google.android.gms.internal.measurement.C2148g6;
import com.google.android.gms.internal.measurement.C2176j7;
import com.google.android.gms.internal.measurement.C2185k7;
import com.google.android.gms.internal.measurement.C2193l6;
import com.google.android.gms.internal.measurement.C2202m6;
import com.google.android.gms.internal.measurement.C2242r6;
import com.google.android.gms.internal.measurement.C2250s6;
import com.google.android.gms.internal.measurement.C2298y6;
import com.google.android.gms.internal.measurement.C2306z6;
import com.google.android.gms.internal.measurement.C7;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.F6;
import com.google.android.gms.internal.measurement.K6;
import com.google.android.gms.internal.measurement.L6;
import com.google.android.gms.internal.measurement.Q6;
import com.google.android.gms.internal.measurement.R6;
import com.google.android.gms.internal.measurement.X6;
import com.google.android.gms.internal.measurement.Y6;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.x7;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class G {

    /* renamed from: A */
    public static final C2317b2 f17230A;

    /* renamed from: A0 */
    public static final C2317b2 f17231A0;

    /* renamed from: B */
    public static final C2317b2 f17232B;

    /* renamed from: B0 */
    public static final C2317b2 f17233B0;

    /* renamed from: C */
    public static final C2317b2 f17234C;

    /* renamed from: C0 */
    public static final C2317b2 f17235C0;

    /* renamed from: D */
    public static final C2317b2 f17236D;

    /* renamed from: D0 */
    public static final C2317b2 f17237D0;

    /* renamed from: E */
    public static final C2317b2 f17238E;

    /* renamed from: E0 */
    public static final C2317b2 f17239E0;

    /* renamed from: F */
    public static final C2317b2 f17240F;

    /* renamed from: F0 */
    public static final C2317b2 f17241F0;

    /* renamed from: G */
    public static final C2317b2 f17242G;

    /* renamed from: G0 */
    public static final C2317b2 f17243G0;

    /* renamed from: H */
    public static final C2317b2 f17244H;

    /* renamed from: H0 */
    public static final C2317b2 f17245H0;

    /* renamed from: I */
    public static final C2317b2 f17246I;

    /* renamed from: I0 */
    public static final C2317b2 f17247I0;

    /* renamed from: J */
    public static final C2317b2 f17248J;

    /* renamed from: J0 */
    public static final C2317b2 f17249J0;

    /* renamed from: K */
    public static final C2317b2 f17250K;

    /* renamed from: K0 */
    public static final C2317b2 f17251K0;

    /* renamed from: L */
    public static final C2317b2 f17252L;

    /* renamed from: L0 */
    public static final C2317b2 f17253L0;

    /* renamed from: M */
    public static final C2317b2 f17254M;

    /* renamed from: M0 */
    public static final C2317b2 f17255M0;

    /* renamed from: N */
    public static final C2317b2 f17256N;

    /* renamed from: N0 */
    public static final C2317b2 f17257N0;

    /* renamed from: O */
    public static final C2317b2 f17258O;

    /* renamed from: O0 */
    public static final C2317b2 f17259O0;

    /* renamed from: P */
    public static final C2317b2 f17260P;

    /* renamed from: P0 */
    public static final C2317b2 f17261P0;

    /* renamed from: Q */
    public static final C2317b2 f17262Q;

    /* renamed from: Q0 */
    public static final C2317b2 f17263Q0;

    /* renamed from: R */
    public static final C2317b2 f17264R;

    /* renamed from: R0 */
    public static final C2317b2 f17265R0;

    /* renamed from: S */
    public static final C2317b2 f17266S;

    /* renamed from: S0 */
    public static final C2317b2 f17267S0;

    /* renamed from: T */
    public static final C2317b2 f17268T;

    /* renamed from: T0 */
    public static final C2317b2 f17269T0;

    /* renamed from: U */
    public static final C2317b2 f17270U;

    /* renamed from: U0 */
    public static final C2317b2 f17271U0;

    /* renamed from: V */
    public static final C2317b2 f17272V;

    /* renamed from: V0 */
    public static final C2317b2 f17273V0;

    /* renamed from: W */
    public static final C2317b2 f17274W;

    /* renamed from: W0 */
    public static final C2317b2 f17275W0;

    /* renamed from: X */
    public static final C2317b2 f17276X;

    /* renamed from: X0 */
    public static final C2317b2 f17277X0;

    /* renamed from: Y */
    public static final C2317b2 f17278Y;

    /* renamed from: Y0 */
    public static final C2317b2 f17279Y0;

    /* renamed from: Z */
    public static final C2317b2 f17280Z;

    /* renamed from: Z0 */
    public static final C2317b2 f17281Z0;

    /* renamed from: a */
    private static final List f17282a = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C2317b2 f17283a0;

    /* renamed from: a1 */
    public static final C2317b2 f17284a1;

    /* renamed from: b */
    public static final C2317b2 f17285b;

    /* renamed from: b0 */
    public static final C2317b2 f17286b0;

    /* renamed from: b1 */
    public static final C2317b2 f17287b1;

    /* renamed from: c */
    public static final C2317b2 f17288c;

    /* renamed from: c0 */
    public static final C2317b2 f17289c0;

    /* renamed from: c1 */
    public static final C2317b2 f17290c1;

    /* renamed from: d */
    public static final C2317b2 f17291d;

    /* renamed from: d0 */
    public static final C2317b2 f17292d0;

    /* renamed from: d1 */
    public static final C2317b2 f17293d1;

    /* renamed from: e */
    public static final C2317b2 f17294e;

    /* renamed from: e0 */
    public static final C2317b2 f17295e0;

    /* renamed from: e1 */
    public static final C2317b2 f17296e1;

    /* renamed from: f */
    public static final C2317b2 f17297f;

    /* renamed from: f0 */
    public static final C2317b2 f17298f0;

    /* renamed from: f1 */
    public static final C2317b2 f17299f1;

    /* renamed from: g */
    public static final C2317b2 f17300g;

    /* renamed from: g0 */
    public static final C2317b2 f17301g0;

    /* renamed from: g1 */
    public static final C2317b2 f17302g1;

    /* renamed from: h */
    public static final C2317b2 f17303h;

    /* renamed from: h0 */
    public static final C2317b2 f17304h0;

    /* renamed from: h1 */
    public static final C2317b2 f17305h1;

    /* renamed from: i */
    public static final C2317b2 f17306i;

    /* renamed from: i0 */
    public static final C2317b2 f17307i0;

    /* renamed from: i1 */
    public static final C2317b2 f17308i1;

    /* renamed from: j */
    public static final C2317b2 f17309j;

    /* renamed from: j0 */
    public static final C2317b2 f17310j0;

    /* renamed from: j1 */
    public static final C2317b2 f17311j1;

    /* renamed from: k */
    public static final C2317b2 f17312k;

    /* renamed from: k0 */
    public static final C2317b2 f17313k0;

    /* renamed from: k1 */
    public static final C2317b2 f17314k1;

    /* renamed from: l */
    public static final C2317b2 f17315l;

    /* renamed from: l0 */
    public static final C2317b2 f17316l0;

    /* renamed from: l1 */
    public static final C2317b2 f17317l1;

    /* renamed from: m */
    public static final C2317b2 f17318m;

    /* renamed from: m0 */
    public static final C2317b2 f17319m0;

    /* renamed from: m1 */
    public static final C2317b2 f17320m1;

    /* renamed from: n */
    public static final C2317b2 f17321n;

    /* renamed from: n0 */
    public static final C2317b2 f17322n0;

    /* renamed from: o */
    public static final C2317b2 f17323o;

    /* renamed from: o0 */
    public static final C2317b2 f17324o0;

    /* renamed from: p */
    public static final C2317b2 f17325p;

    /* renamed from: p0 */
    public static final C2317b2 f17326p0;

    /* renamed from: q */
    public static final C2317b2 f17327q;

    /* renamed from: q0 */
    public static final C2317b2 f17328q0;

    /* renamed from: r */
    public static final C2317b2 f17329r;

    /* renamed from: r0 */
    public static final C2317b2 f17330r0;

    /* renamed from: s */
    public static final C2317b2 f17331s;

    /* renamed from: s0 */
    public static final C2317b2 f17332s0;

    /* renamed from: t */
    public static final C2317b2 f17333t;

    /* renamed from: t0 */
    public static final C2317b2 f17334t0;

    /* renamed from: u */
    public static final C2317b2 f17335u;

    /* renamed from: u0 */
    public static final C2317b2 f17336u0;

    /* renamed from: v */
    public static final C2317b2 f17337v;

    /* renamed from: v0 */
    public static final C2317b2 f17338v0;

    /* renamed from: w */
    public static final C2317b2 f17339w;

    /* renamed from: w0 */
    public static final C2317b2 f17340w0;

    /* renamed from: x */
    public static final C2317b2 f17341x;

    /* renamed from: x0 */
    public static final C2317b2 f17342x0;

    /* renamed from: y */
    public static final C2317b2 f17343y;

    /* renamed from: y0 */
    public static final C2317b2 f17344y0;

    /* renamed from: z */
    public static final C2317b2 f17345z;

    /* renamed from: z0 */
    public static final C2317b2 f17346z0;

    static {
        DesugarCollections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f17285b = F("measurement.ad_id_cache_time", valueOf, new Z1() { // from class: com.google.android.gms.measurement.internal.H
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.a());
                return valueOf2;
            }
        });
        f17288c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.B());
                return valueOf2;
            }
        });
        f17291d = F("measurement.monitoring.sample_period_millis", 86400000L, new Z1() { // from class: com.google.android.gms.measurement.internal.L0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.Y());
                return valueOf2;
            }
        });
        f17294e = c("measurement.config.cache_time", 86400000L, 3600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.X0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.I());
                return valueOf2;
            }
        }, false);
        f17297f = F("measurement.config.url_scheme", "https", new Z1() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String t8;
                t8 = C2094a6.t();
                return t8;
            }
        });
        f17300g = F("measurement.config.url_authority", "app-measurement.com", new Z1() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String s8;
                s8 = C2094a6.s();
                return s8;
            }
        });
        f17303h = F("measurement.upload.max_bundles", 100, new Z1() { // from class: com.google.android.gms.measurement.internal.J1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.g());
                return valueOf2;
            }
        });
        f17306i = F("measurement.upload.max_batch_size", 65536, new Z1() { // from class: com.google.android.gms.measurement.internal.V1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.o());
                return valueOf2;
            }
        });
        f17309j = F("measurement.upload.max_bundle_size", 65536, new Z1() { // from class: com.google.android.gms.measurement.internal.S
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.f());
                return valueOf2;
            }
        });
        f17312k = F("measurement.upload.max_events_per_bundle", 1000, new Z1() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.j());
                return valueOf2;
            }
        });
        f17315l = F("measurement.upload.max_events_per_day", 100000, new Z1() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.k());
                return valueOf2;
            }
        });
        f17318m = F("measurement.upload.max_error_events_per_day", 1000, new Z1() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.i());
                return valueOf2;
            }
        });
        f17321n = F("measurement.upload.max_public_events_per_day", Integer.valueOf(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS), new Z1() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.l());
                return valueOf2;
            }
        });
        f17323o = F("measurement.upload.max_conversions_per_day", 10000, new Z1() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.h());
                return valueOf2;
            }
        });
        f17325p = F("measurement.upload.max_realtime_events_per_day", 10, new Z1() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.n());
                return valueOf2;
            }
        });
        f17327q = F("measurement.store.max_stored_events_per_app", 100000, new Z1() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.P());
                return valueOf2;
            }
        });
        f17329r = F("measurement.upload.url", "https://app-measurement.com/a", new Z1() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String D8;
                D8 = C2094a6.D();
                return D8;
            }
        });
        f17331s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new Z1() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String v8;
                v8 = C2094a6.v();
                return v8;
            }
        });
        f17333t = F("measurement.upload.backoff_period", 43200000L, new Z1() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.c());
                return valueOf2;
            }
        });
        f17335u = F("measurement.upload.window_interval", 3600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.r());
                return valueOf2;
            }
        });
        f17337v = F("measurement.upload.interval", 3600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.C0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.e());
                return valueOf2;
            }
        });
        f17339w = F("measurement.upload.realtime_upload_interval", valueOf, new Z1() { // from class: com.google.android.gms.measurement.internal.B0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.Z());
                return valueOf2;
            }
        });
        f17341x = F("measurement.upload.debug_upload_interval", 1000L, new Z1() { // from class: com.google.android.gms.measurement.internal.E0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.J());
                return valueOf2;
            }
        });
        f17343y = F("measurement.upload.minimum_delay", 500L, new Z1() { // from class: com.google.android.gms.measurement.internal.D0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.X());
                return valueOf2;
            }
        });
        f17345z = F("measurement.alarm_manager.minimum_interval", Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS), new Z1() { // from class: com.google.android.gms.measurement.internal.G0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.W());
                return valueOf2;
            }
        });
        f17230A = F("measurement.upload.stale_data_deletion_interval", 86400000L, new Z1() { // from class: com.google.android.gms.measurement.internal.F0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.c0());
                return valueOf2;
            }
        });
        f17232B = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new Z1() { // from class: com.google.android.gms.measurement.internal.I0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.a0());
                return valueOf2;
            }
        });
        f17234C = F("measurement.upload.initial_upload_delay_time", 15000L, new Z1() { // from class: com.google.android.gms.measurement.internal.H0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.d());
                return valueOf2;
            }
        });
        f17236D = F("measurement.upload.retry_time", 1800000L, new Z1() { // from class: com.google.android.gms.measurement.internal.K0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.q());
                return valueOf2;
            }
        });
        f17238E = F("measurement.upload.retry_count", 6, new Z1() { // from class: com.google.android.gms.measurement.internal.M0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.p());
                return valueOf2;
            }
        });
        f17240F = F("measurement.upload.max_queue_time", 518400000L, new Z1() { // from class: com.google.android.gms.measurement.internal.O0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.m());
                return valueOf2;
            }
        });
        f17242G = F("measurement.upload.google_signal_max_queue_time", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS), new Z1() { // from class: com.google.android.gms.measurement.internal.N0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.L());
                return valueOf2;
            }
        });
        f17244H = F("measurement.lifetimevalue.max_currency_tracked", 4, new Z1() { // from class: com.google.android.gms.measurement.internal.Q0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.M());
                return valueOf2;
            }
        });
        f17246I = F("measurement.audience.filter_result_max_count", 200, new Z1() { // from class: com.google.android.gms.measurement.internal.P0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.R());
                return valueOf2;
            }
        });
        f17248J = a("measurement.upload.max_public_user_properties", 100);
        f17250K = a("measurement.upload.max_event_name_cardinality", 2000);
        f17252L = a("measurement.upload.max_public_event_params", 100);
        f17254M = F("measurement.service_client.idle_disconnect_millis", 5000L, new Z1() { // from class: com.google.android.gms.measurement.internal.S0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.b0());
                return valueOf2;
            }
        });
        Boolean bool = Boolean.FALSE;
        f17256N = F("measurement.test.boolean_flag", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.R0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2122d7.f());
                return valueOf2;
            }
        });
        f17258O = F("measurement.test.string_flag", "---", new Z1() { // from class: com.google.android.gms.measurement.internal.U0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String e8;
                e8 = C2122d7.e();
                return e8;
            }
        });
        f17260P = F("measurement.test.long_flag", -1L, new Z1() { // from class: com.google.android.gms.measurement.internal.T0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2122d7.d());
                return valueOf2;
            }
        });
        b("measurement.test.cached_long_flag", -1L, new Z1() { // from class: com.google.android.gms.measurement.internal.V0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2122d7.b());
                return valueOf2;
            }
        });
        f17262Q = F("measurement.test.int_flag", -2, new Z1() { // from class: com.google.android.gms.measurement.internal.Y0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2122d7.c());
                return valueOf2;
            }
        });
        f17264R = F("measurement.test.double_flag", Double.valueOf(-3.0d), new Z1() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Double valueOf2;
                valueOf2 = Double.valueOf(C2122d7.a());
                return valueOf2;
            }
        });
        f17266S = F("measurement.experiment.max_ids", 50, new Z1() { // from class: com.google.android.gms.measurement.internal.Z0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.Q());
                return valueOf2;
            }
        });
        f17268T = F("measurement.upload.max_item_scoped_custom_parameters", 27, new Z1() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.S());
                return valueOf2;
            }
        });
        f17270U = b("measurement.upload.max_event_parameter_value_length", 500, new Z1() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.O());
                return valueOf2;
            }
        });
        f17272V = F("measurement.max_bundles_per_iteration", 100, new Z1() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.H());
                return valueOf2;
            }
        });
        f17274W = F("measurement.sdk.attribution.cache.ttl", 604800000L, new Z1() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.e0());
                return valueOf2;
            }
        });
        f17276X = F("measurement.redaction.app_instance_id.ttl", 7200000L, new Z1() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.b());
                return valueOf2;
            }
        });
        f17278Y = F("measurement.rb.attribution.client.min_ad_services_version", 7, new Z1() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.V());
                return valueOf2;
            }
        });
        f17280Z = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new Z1() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.N());
                return valueOf2;
            }
        });
        f17283a0 = F("measurement.rb.attribution.uri_scheme", "https", new Z1() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String C8;
                C8 = C2094a6.C();
                return C8;
            }
        });
        f17286b0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new Z1() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String y8;
                y8 = C2094a6.y();
                return y8;
            }
        });
        f17289c0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new Z1() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String z8;
                z8 = C2094a6.z();
                return z8;
            }
        });
        f17292d0 = F("measurement.session.engagement_interval", 3600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.K());
                return valueOf2;
            }
        });
        f17295e0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new Z1() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String w8;
                w8 = C2094a6.w();
                return w8;
            }
        });
        f17298f0 = F("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new Z1() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String E8;
                E8 = C2094a6.E();
                return E8;
            }
        });
        f17301g0 = F("measurement.rb.attribution.event_params", "value|currency", new Z1() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String u8;
                u8 = C2094a6.u();
                return u8;
            }
        });
        f17304h0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new Z1() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String A8;
                A8 = C2094a6.A();
                return A8;
            }
        });
        f17307i0 = F("measurement.rb.attribution.max_queue_time", 1209600000L, new Z1() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2094a6.d0());
                return valueOf2;
            }
        });
        F("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new Z1() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.U());
                return valueOf2;
            }
        });
        f17310j0 = F("measurement.rb.max_trigger_registrations_per_day", 0, new Z1() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2094a6.T());
                return valueOf2;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f17313k0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2094a6.F());
                return valueOf2;
            }
        });
        f17316l0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2094a6.G());
                return valueOf2;
            }
        });
        f17319m0 = F("measurement.collection.log_event_and_bundle_v2", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.C1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2131e7.a());
                return valueOf2;
            }
        });
        f17322n0 = a("measurement.quality.checksum", bool);
        f17324o0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.A1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2306z6.c());
                return valueOf2;
            }
        });
        f17326p0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.E1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2306z6.b());
                return valueOf2;
            }
        });
        f17328q0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.G1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2306z6.d());
                return valueOf2;
            }
        });
        f17330r0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.F1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Y6.a());
                return valueOf2;
            }
        });
        f17332s0 = F("measurement.integration.disable_firebase_instance_id", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.I1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(v7.b());
                return valueOf2;
            }
        });
        f17334t0 = F("measurement.collection.service.update_with_analytics_fix", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.H1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(x7.a());
                return valueOf2;
            }
        });
        f17336u0 = F("measurement.service.storage_consent_support_version", 203600, new Z1() { // from class: com.google.android.gms.measurement.internal.K1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2139f6.a());
                return valueOf2;
            }
        });
        f17338v0 = F("measurement.service.store_null_safelist", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.M1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2250s6.b());
                return valueOf2;
            }
        });
        f17340w0 = F("measurement.service.store_safelist", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.L1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2250s6.c());
                return valueOf2;
            }
        });
        f17342x0 = F("measurement.session_stitching_token_enabled", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.O1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2185k7.b());
                return valueOf2;
            }
        });
        f17344y0 = b("measurement.sgtm.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.N1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(q7.e());
                return valueOf2;
            }
        });
        f17346z0 = b("measurement.sgtm.preview_mode_enabled", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.P1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(q7.c());
                return valueOf2;
            }
        });
        f17231A0 = b("measurement.sgtm.rollout_percentage_fix", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.S1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(q7.d());
                return valueOf2;
            }
        });
        f17233B0 = b("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa", new Z1() { // from class: com.google.android.gms.measurement.internal.R1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                String x8;
                x8 = C2094a6.x();
                return x8;
            }
        });
        f17235C0 = F("measurement.sgtm.upload_queue", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.U1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(q7.f());
                return valueOf2;
            }
        });
        f17237D0 = F("measurement.sgtm.google_signal.enable", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.T1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(q7.b());
                return valueOf2;
            }
        });
        f17239E0 = F("measurement.gmscore_feature_tracking", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.W1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(R6.b());
                return valueOf2;
            }
        });
        f17241F0 = F("measurement.gmscore_client_telemetry", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.Y1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                return Boolean.valueOf(R6.c());
            }
        });
        f17243G0 = F("measurement.gmscore_network_migration", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.X1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(X6.b());
                return valueOf2;
            }
        });
        f17245H0 = b("measurement.fix_health_monitor_stack_trace", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.a2
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(F6.b());
                return valueOf2;
            }
        });
        f17247I0 = b("measurement.rb.attribution.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.I
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.i());
                return valueOf2;
            }
        });
        f17249J0 = b("measurement.rb.attribution.client2", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.L
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.e());
                return valueOf2;
            }
        });
        f17251K0 = F("measurement.rb.attribution.uuid_generation", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.K
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.k());
                return valueOf2;
            }
        });
        f17253L0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.N
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.j());
                return valueOf2;
            }
        });
        F("measurement.rb.attribution.followup1.service", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.M
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.f());
                return valueOf2;
            }
        });
        f17255M0 = F("measurement.rb.attribution.retry_disposition", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.P
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.h());
                return valueOf2;
            }
        });
        f17257N0 = F("measurement.rb.attribution.ad_campaign_info", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.O
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.b());
                return valueOf2;
            }
        });
        f17259O0 = b("measurement.rb.attribution.improved_retry", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.Q
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.l());
                return valueOf2;
            }
        });
        f17261P0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.U
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                return Boolean.valueOf(p7.a());
            }
        });
        f17263Q0 = F("measurement.client.sessions.enable_pause_engagement_in_background", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.W
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                return Boolean.valueOf(p7.b());
            }
        });
        f17265R0 = F("measurement.dma_consent.service_dcu_event2", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.V
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2242r6.b());
                return valueOf2;
            }
        });
        f17267S0 = F("measurement.dma_consent.services_database_update_fix", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.Z
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2242r6.a());
                return valueOf2;
            }
        });
        f17269T0 = F("measurement.dma_consent.setting_npa_inline_fix", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.X
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2242r6.c());
                return valueOf2;
            }
        });
        f17271U0 = b("measurement.gbraid_campaign.gbraid.client", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Q6.b());
                return valueOf2;
            }
        });
        f17273V0 = b("measurement.gbraid_campaign.gbraid.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Q6.c());
                return valueOf2;
            }
        });
        f17275W0 = F("measurement.service.consent.pfo_on_fx", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2298y6.b());
                return valueOf2;
            }
        });
        f17277X0 = F("measurement.service.consent.params_on_fx", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2298y6.a());
                return valueOf2;
            }
        });
        f17279Y0 = b("measurement.consent.stop_reset_on_storage_denied.client", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2148g6.b());
                return valueOf2;
            }
        });
        f17281Z0 = b("measurement.consent.stop_reset_on_storage_denied.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.A0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2148g6.c());
                return valueOf2;
            }
        });
        f17284a1 = F("measurement.consent.scrub_audience_data_analytics_consent", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.J0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2148g6.d());
                return valueOf2;
            }
        });
        f17287b1 = F("measurement.consent.fix_first_open_count_from_snapshot", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.W0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2148g6.e());
                return valueOf2;
            }
        });
        f17290c1 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(E6.a());
                return valueOf2;
            }
        });
        f17293d1 = F("measurement.rb.attribution.service.bundle_on_backgrounded", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.d());
                return valueOf2;
            }
        });
        f17296e1 = F("measurement.rb.attribution.client.bundle_on_backgrounded", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.D1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.c());
                return valueOf2;
            }
        });
        f17299f1 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.Q1
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2202m6.b());
                return valueOf2;
            }
        });
        f17302g1 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.J
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2202m6.a());
                return valueOf2;
            }
        });
        f17305h1 = F("measurement.set_default_event_parameters_with_backfill.service", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.T
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2193l6.d());
                return valueOf2;
            }
        });
        F("measurement.set_default_event_parameters_with_backfill.client.dev", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2193l6.b());
                return valueOf2;
            }
        });
        f17308i1 = F("measurement.defensively_copy_bundles_validate_default_params", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2193l6.c());
                return valueOf2;
            }
        });
        f17311j1 = F("measurement.fix_origin_in_upload_utils.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(K6.a());
                return valueOf2;
            }
        });
        F("measurement.chimera.parameter.service", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(com.google.android.gms.internal.measurement.Z5.a());
                return valueOf2;
            }
        });
        f17314k1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(com.google.android.gms.internal.measurement.U5.a());
                return valueOf2;
            }
        });
        f17317l1 = F("measurement.persisted_config_defensive_copies", bool, new Z1() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(L6.a());
                return valueOf2;
            }
        });
        F("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2176j7.g());
                return valueOf2;
            }
        });
        f17320m1 = F("measurement.currency.escape_underscore_fix", bool2, new Z1() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.Z1
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C7.a());
                return valueOf2;
            }
        });
    }

    private static C2317b2 F(String str, Object obj, Z1 z12) {
        return c(str, obj, obj, z12, false);
    }

    private static C2317b2 a(String str, Object obj) {
        return c(str, obj, obj, null, false);
    }

    private static C2317b2 b(String str, Object obj, Z1 z12) {
        return c(str, obj, obj, z12, true);
    }

    private static C2317b2 c(String str, Object obj, Object obj2, Z1 z12, boolean z8) {
        C2317b2 c2317b2 = new C2317b2(str, obj, obj2, z12);
        if (z8) {
            f17282a.add(c2317b2);
        }
        return c2317b2;
    }

    public static Map e(Context context) {
        com.google.android.gms.internal.measurement.T2 a9 = com.google.android.gms.internal.measurement.T2.a(context.getContentResolver(), AbstractC2172j3.a("com.google.android.gms.measurement"), new Runnable() { // from class: l0.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2163i3.m();
            }
        });
        if (a9 == null) {
            return Collections.emptyMap();
        }
        return a9.b();
    }
}
