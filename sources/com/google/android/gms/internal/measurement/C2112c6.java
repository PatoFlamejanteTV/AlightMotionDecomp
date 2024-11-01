package com.google.android.gms.internal.measurement;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2112c6 implements InterfaceC2121d6 {

    /* renamed from: A, reason: collision with root package name */
    private static final AbstractC2163i3 f16619A;

    /* renamed from: B, reason: collision with root package name */
    private static final AbstractC2163i3 f16620B;

    /* renamed from: C, reason: collision with root package name */
    private static final AbstractC2163i3 f16621C;

    /* renamed from: D, reason: collision with root package name */
    private static final AbstractC2163i3 f16622D;

    /* renamed from: E, reason: collision with root package name */
    private static final AbstractC2163i3 f16623E;

    /* renamed from: F, reason: collision with root package name */
    private static final AbstractC2163i3 f16624F;

    /* renamed from: G, reason: collision with root package name */
    private static final AbstractC2163i3 f16625G;

    /* renamed from: H, reason: collision with root package name */
    private static final AbstractC2163i3 f16626H;

    /* renamed from: I, reason: collision with root package name */
    private static final AbstractC2163i3 f16627I;

    /* renamed from: J, reason: collision with root package name */
    private static final AbstractC2163i3 f16628J;

    /* renamed from: K, reason: collision with root package name */
    private static final AbstractC2163i3 f16629K;

    /* renamed from: L, reason: collision with root package name */
    private static final AbstractC2163i3 f16630L;

    /* renamed from: M, reason: collision with root package name */
    private static final AbstractC2163i3 f16631M;

    /* renamed from: N, reason: collision with root package name */
    private static final AbstractC2163i3 f16632N;

    /* renamed from: O, reason: collision with root package name */
    private static final AbstractC2163i3 f16633O;

    /* renamed from: P, reason: collision with root package name */
    private static final AbstractC2163i3 f16634P;

    /* renamed from: Q, reason: collision with root package name */
    private static final AbstractC2163i3 f16635Q;

    /* renamed from: R, reason: collision with root package name */
    private static final AbstractC2163i3 f16636R;

    /* renamed from: S, reason: collision with root package name */
    private static final AbstractC2163i3 f16637S;

    /* renamed from: T, reason: collision with root package name */
    private static final AbstractC2163i3 f16638T;

    /* renamed from: U, reason: collision with root package name */
    private static final AbstractC2163i3 f16639U;

    /* renamed from: V, reason: collision with root package name */
    private static final AbstractC2163i3 f16640V;

    /* renamed from: W, reason: collision with root package name */
    private static final AbstractC2163i3 f16641W;

    /* renamed from: X, reason: collision with root package name */
    private static final AbstractC2163i3 f16642X;

    /* renamed from: Y, reason: collision with root package name */
    private static final AbstractC2163i3 f16643Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final AbstractC2163i3 f16644Z;

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16645a;

    /* renamed from: a0, reason: collision with root package name */
    private static final AbstractC2163i3 f16646a0;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16647b;

    /* renamed from: b0, reason: collision with root package name */
    private static final AbstractC2163i3 f16648b0;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16649c;

    /* renamed from: c0, reason: collision with root package name */
    private static final AbstractC2163i3 f16650c0;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2163i3 f16651d;

    /* renamed from: d0, reason: collision with root package name */
    private static final AbstractC2163i3 f16652d0;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2163i3 f16653e;

    /* renamed from: e0, reason: collision with root package name */
    private static final AbstractC2163i3 f16654e0;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2163i3 f16655f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC2163i3 f16656g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC2163i3 f16657h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2163i3 f16658i;

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC2163i3 f16659j;

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC2163i3 f16660k;

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC2163i3 f16661l;

    /* renamed from: m, reason: collision with root package name */
    private static final AbstractC2163i3 f16662m;

    /* renamed from: n, reason: collision with root package name */
    private static final AbstractC2163i3 f16663n;

    /* renamed from: o, reason: collision with root package name */
    private static final AbstractC2163i3 f16664o;

    /* renamed from: p, reason: collision with root package name */
    private static final AbstractC2163i3 f16665p;

    /* renamed from: q, reason: collision with root package name */
    private static final AbstractC2163i3 f16666q;

    /* renamed from: r, reason: collision with root package name */
    private static final AbstractC2163i3 f16667r;

    /* renamed from: s, reason: collision with root package name */
    private static final AbstractC2163i3 f16668s;

    /* renamed from: t, reason: collision with root package name */
    private static final AbstractC2163i3 f16669t;

    /* renamed from: u, reason: collision with root package name */
    private static final AbstractC2163i3 f16670u;

    /* renamed from: v, reason: collision with root package name */
    private static final AbstractC2163i3 f16671v;

    /* renamed from: w, reason: collision with root package name */
    private static final AbstractC2163i3 f16672w;

    /* renamed from: x, reason: collision with root package name */
    private static final AbstractC2163i3 f16673x;

    /* renamed from: y, reason: collision with root package name */
    private static final AbstractC2163i3 f16674y;

    /* renamed from: z, reason: collision with root package name */
    private static final AbstractC2163i3 f16675z;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16645a = e8.b("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        f16647b = e8.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f16649c = e8.d("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f16651d = e8.b("measurement.max_bundles_per_iteration", 100L);
        f16653e = e8.b("measurement.config.cache_time", 86400000L);
        e8.c("measurement.log_tag", "FA");
        f16655f = e8.c("measurement.config.url_authority", "app-measurement.com");
        f16656g = e8.c("measurement.config.url_scheme", "https");
        f16657h = e8.b("measurement.upload.debug_upload_interval", 1000L);
        f16658i = e8.b("measurement.session.engagement_interval", 3600000L);
        f16659j = e8.c("measurement.rb.attribution.event_params", "value|currency");
        e8.b("measurement.id.rb.attribution.app_allowlist", 0L);
        f16660k = e8.b("measurement.upload.google_signal_max_queue_time", 605000L);
        f16661l = e8.c("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        f16662m = e8.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        f16663n = e8.b("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        f16664o = e8.b("measurement.upload.max_event_parameter_value_length", 500L);
        f16665p = e8.b("measurement.store.max_stored_events_per_app", 100000L);
        f16666q = e8.b("measurement.experiment.max_ids", 50L);
        f16667r = e8.b("measurement.audience.filter_result_max_count", 200L);
        f16668s = e8.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f16669t = e8.b("measurement.rb.max_trigger_registrations_per_day", 0L);
        f16670u = e8.b("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        f16671v = e8.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f16672w = e8.b("measurement.alarm_manager.minimum_interval", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        f16673x = e8.b("measurement.upload.minimum_delay", 500L);
        f16674y = e8.b("measurement.monitoring.sample_period_millis", 86400000L);
        f16675z = e8.d("measurement.config.notify_trigger_uris_on_backgrounded", true);
        f16619A = e8.c("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        f16620B = e8.b("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        f16621C = e8.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        e8.b("measurement.config.cache_time.service", 3600000L);
        f16622D = e8.b("measurement.service_client.idle_disconnect_millis", 5000L);
        e8.c("measurement.log_tag.service", "FA-SVC");
        f16623E = e8.c("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa");
        f16624F = e8.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        f16625G = e8.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        f16626H = e8.b("measurement.rb.attribution.max_queue_time", 1209600000L);
        f16627I = e8.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f16628J = e8.c("measurement.rb.attribution.query_parameters_to_remove", "");
        f16629K = e8.c("measurement.rb.attribution.uri_scheme", "https");
        f16630L = e8.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        f16631M = e8.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        f16632N = e8.b("measurement.upload.backoff_period", 43200000L);
        f16633O = e8.b("measurement.upload.initial_upload_delay_time", 15000L);
        f16634P = e8.b("measurement.upload.interval", 3600000L);
        f16635Q = e8.b("measurement.upload.max_bundle_size", 65536L);
        f16636R = e8.b("measurement.upload.max_bundles", 100L);
        f16637S = e8.b("measurement.upload.max_conversions_per_day", 500L);
        f16638T = e8.b("measurement.upload.max_error_events_per_day", 1000L);
        f16639U = e8.b("measurement.upload.max_events_per_bundle", 1000L);
        f16640V = e8.b("measurement.upload.max_events_per_day", 100000L);
        f16641W = e8.b("measurement.upload.max_public_events_per_day", 50000L);
        f16642X = e8.b("measurement.upload.max_queue_time", 518400000L);
        f16643Y = e8.b("measurement.upload.max_realtime_events_per_day", 10L);
        f16644Z = e8.b("measurement.upload.max_batch_size", 65536L);
        f16646a0 = e8.b("measurement.upload.retry_count", 6L);
        f16648b0 = e8.b("measurement.upload.retry_time", 1800000L);
        f16650c0 = e8.c("measurement.upload.url", "https://app-measurement.com/a");
        f16652d0 = e8.b("measurement.upload.window_interval", 3600000L);
        f16654e0 = e8.c("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long A() {
        return ((Long) f16658i.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long B() {
        return ((Long) f16662m.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long C() {
        return ((Long) f16668s.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long D() {
        return ((Long) f16644Z.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long E() {
        return ((Long) f16622D.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long F() {
        return ((Long) f16635Q.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String G() {
        return (String) f16619A.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long H() {
        return ((Long) f16669t.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long I() {
        return ((Long) f16646a0.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String J() {
        return (String) f16629K.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long K() {
        return ((Long) f16624F.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long L() {
        return ((Long) f16636R.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String M() {
        return (String) f16623E.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long N() {
        return ((Long) f16642X.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long O() {
        return ((Long) f16633O.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String P() {
        return (String) f16659j.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long Q() {
        return ((Long) f16620B.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long R() {
        return ((Long) f16643Y.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long S() {
        return ((Long) f16667r.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long T() {
        return ((Long) f16621C.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long U() {
        return ((Long) f16634P.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String V() {
        return (String) f16661l.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long W() {
        return ((Long) f16631M.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String X() {
        return (String) f16655f.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final boolean Y() {
        return ((Boolean) f16649c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long Z() {
        return ((Long) f16673x.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long a() {
        return ((Long) f16664o.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long a0() {
        return ((Long) f16639U.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long b() {
        return ((Long) f16651d.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long b0() {
        return ((Long) f16641W.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long c0() {
        return ((Long) f16632N.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long d() {
        return ((Long) f16663n.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String d0() {
        return (String) f16656g.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long e() {
        return ((Long) f16660k.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final boolean e0() {
        return ((Boolean) f16675z.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long f() {
        return ((Long) f16666q.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long f0() {
        return ((Long) f16674y.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long g() {
        return ((Long) f16665p.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long h() {
        return ((Long) f16670u.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long i() {
        return ((Long) f16648b0.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String j() {
        return (String) f16650c0.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long k() {
        return ((Long) f16626H.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long l() {
        return ((Long) f16637S.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String m() {
        return (String) f16625G.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String n() {
        return (String) f16628J.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long o() {
        return ((Long) f16671v.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long p() {
        return ((Long) f16630L.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long q() {
        return ((Long) f16652d0.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String r() {
        return (String) f16654e0.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long s() {
        return ((Long) f16672w.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long t() {
        return ((Long) f16638T.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long u() {
        return ((Long) f16640V.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final String v() {
        return (String) f16627I.e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long w() {
        return ((Long) f16645a.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long x() {
        return ((Long) f16647b.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long y() {
        return ((Long) f16653e.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121d6
    public final long z() {
        return ((Long) f16657h.e()).longValue();
    }
}
