package androidx.compose.ui.input.key;

import androidx.collection.a;
import androidx.compose.runtime.ComposerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class Key {
    private final long keyCode;
    public static final Companion Companion = new Companion(null);
    private static final long Unknown = Key_androidKt.Key(0);
    private static final long SoftLeft = Key_androidKt.Key(1);
    private static final long SoftRight = Key_androidKt.Key(2);
    private static final long Home = Key_androidKt.Key(3);
    private static final long Back = Key_androidKt.Key(4);
    private static final long Help = Key_androidKt.Key(259);
    private static final long NavigatePrevious = Key_androidKt.Key(260);
    private static final long NavigateNext = Key_androidKt.Key(261);
    private static final long NavigateIn = Key_androidKt.Key(262);
    private static final long NavigateOut = Key_androidKt.Key(263);
    private static final long SystemNavigationUp = Key_androidKt.Key(280);
    private static final long SystemNavigationDown = Key_androidKt.Key(281);
    private static final long SystemNavigationLeft = Key_androidKt.Key(282);
    private static final long SystemNavigationRight = Key_androidKt.Key(283);
    private static final long Call = Key_androidKt.Key(5);
    private static final long EndCall = Key_androidKt.Key(6);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionCenter = Key_androidKt.Key(23);
    private static final long DirectionUpLeft = Key_androidKt.Key(268);
    private static final long DirectionDownLeft = Key_androidKt.Key(269);
    private static final long DirectionUpRight = Key_androidKt.Key(SubsamplingScaleImageView.ORIENTATION_270);
    private static final long DirectionDownRight = Key_androidKt.Key(271);
    private static final long VolumeUp = Key_androidKt.Key(24);
    private static final long VolumeDown = Key_androidKt.Key(25);
    private static final long Power = Key_androidKt.Key(26);
    private static final long Camera = Key_androidKt.Key(27);
    private static final long Clear = Key_androidKt.Key(28);
    private static final long Zero = Key_androidKt.Key(7);
    private static final long One = Key_androidKt.Key(8);
    private static final long Two = Key_androidKt.Key(9);
    private static final long Three = Key_androidKt.Key(10);
    private static final long Four = Key_androidKt.Key(11);
    private static final long Five = Key_androidKt.Key(12);
    private static final long Six = Key_androidKt.Key(13);
    private static final long Seven = Key_androidKt.Key(14);
    private static final long Eight = Key_androidKt.Key(15);
    private static final long Nine = Key_androidKt.Key(16);
    private static final long Plus = Key_androidKt.Key(81);
    private static final long Minus = Key_androidKt.Key(69);
    private static final long Multiply = Key_androidKt.Key(17);
    private static final long Equals = Key_androidKt.Key(70);
    private static final long Pound = Key_androidKt.Key(18);

    /* renamed from: A, reason: collision with root package name */
    private static final long f14483A = Key_androidKt.Key(29);

    /* renamed from: B, reason: collision with root package name */
    private static final long f14484B = Key_androidKt.Key(30);

    /* renamed from: C, reason: collision with root package name */
    private static final long f14485C = Key_androidKt.Key(31);

    /* renamed from: D, reason: collision with root package name */
    private static final long f14486D = Key_androidKt.Key(32);

    /* renamed from: E, reason: collision with root package name */
    private static final long f14487E = Key_androidKt.Key(33);

    /* renamed from: F, reason: collision with root package name */
    private static final long f14488F = Key_androidKt.Key(34);

    /* renamed from: G, reason: collision with root package name */
    private static final long f14496G = Key_androidKt.Key(35);

    /* renamed from: H, reason: collision with root package name */
    private static final long f14497H = Key_androidKt.Key(36);

    /* renamed from: I, reason: collision with root package name */
    private static final long f14498I = Key_androidKt.Key(37);

    /* renamed from: J, reason: collision with root package name */
    private static final long f14499J = Key_androidKt.Key(38);

    /* renamed from: K, reason: collision with root package name */
    private static final long f14500K = Key_androidKt.Key(39);

    /* renamed from: L, reason: collision with root package name */
    private static final long f14501L = Key_androidKt.Key(40);

    /* renamed from: M, reason: collision with root package name */
    private static final long f14502M = Key_androidKt.Key(41);

    /* renamed from: N, reason: collision with root package name */
    private static final long f14503N = Key_androidKt.Key(42);

    /* renamed from: O, reason: collision with root package name */
    private static final long f14504O = Key_androidKt.Key(43);

    /* renamed from: P, reason: collision with root package name */
    private static final long f14505P = Key_androidKt.Key(44);

    /* renamed from: Q, reason: collision with root package name */
    private static final long f14506Q = Key_androidKt.Key(45);

    /* renamed from: R, reason: collision with root package name */
    private static final long f14507R = Key_androidKt.Key(46);

    /* renamed from: S, reason: collision with root package name */
    private static final long f14508S = Key_androidKt.Key(47);

    /* renamed from: T, reason: collision with root package name */
    private static final long f14509T = Key_androidKt.Key(48);

    /* renamed from: U, reason: collision with root package name */
    private static final long f14510U = Key_androidKt.Key(49);

    /* renamed from: V, reason: collision with root package name */
    private static final long f14511V = Key_androidKt.Key(50);

    /* renamed from: W, reason: collision with root package name */
    private static final long f14512W = Key_androidKt.Key(51);

    /* renamed from: X, reason: collision with root package name */
    private static final long f14513X = Key_androidKt.Key(52);

    /* renamed from: Y, reason: collision with root package name */
    private static final long f14514Y = Key_androidKt.Key(53);

    /* renamed from: Z, reason: collision with root package name */
    private static final long f14515Z = Key_androidKt.Key(54);
    private static final long Comma = Key_androidKt.Key(55);
    private static final long Period = Key_androidKt.Key(56);
    private static final long AltLeft = Key_androidKt.Key(57);
    private static final long AltRight = Key_androidKt.Key(58);
    private static final long ShiftLeft = Key_androidKt.Key(59);
    private static final long ShiftRight = Key_androidKt.Key(60);
    private static final long Tab = Key_androidKt.Key(61);
    private static final long Spacebar = Key_androidKt.Key(62);
    private static final long Symbol = Key_androidKt.Key(63);
    private static final long Browser = Key_androidKt.Key(64);
    private static final long Envelope = Key_androidKt.Key(65);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(112);
    private static final long Escape = Key_androidKt.Key(111);
    private static final long CtrlLeft = Key_androidKt.Key(113);
    private static final long CtrlRight = Key_androidKt.Key(114);
    private static final long CapsLock = Key_androidKt.Key(115);
    private static final long ScrollLock = Key_androidKt.Key(116);
    private static final long MetaLeft = Key_androidKt.Key(117);
    private static final long MetaRight = Key_androidKt.Key(118);
    private static final long Function = Key_androidKt.Key(119);
    private static final long PrintScreen = Key_androidKt.Key(120);
    private static final long Break = Key_androidKt.Key(121);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Grave = Key_androidKt.Key(68);
    private static final long LeftBracket = Key_androidKt.Key(71);
    private static final long RightBracket = Key_androidKt.Key(72);
    private static final long Slash = Key_androidKt.Key(76);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long Semicolon = Key_androidKt.Key(74);
    private static final long Apostrophe = Key_androidKt.Key(75);
    private static final long At = Key_androidKt.Key(77);
    private static final long Number = Key_androidKt.Key(78);
    private static final long HeadsetHook = Key_androidKt.Key(79);
    private static final long Focus = Key_androidKt.Key(80);
    private static final long Menu = Key_androidKt.Key(82);
    private static final long Notification = Key_androidKt.Key(83);
    private static final long Search = Key_androidKt.Key(84);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long PictureSymbols = Key_androidKt.Key(94);
    private static final long SwitchCharset = Key_androidKt.Key(95);
    private static final long ButtonA = Key_androidKt.Key(96);
    private static final long ButtonB = Key_androidKt.Key(97);
    private static final long ButtonC = Key_androidKt.Key(98);
    private static final long ButtonX = Key_androidKt.Key(99);
    private static final long ButtonY = Key_androidKt.Key(100);
    private static final long ButtonZ = Key_androidKt.Key(101);
    private static final long ButtonL1 = Key_androidKt.Key(102);
    private static final long ButtonR1 = Key_androidKt.Key(103);
    private static final long ButtonL2 = Key_androidKt.Key(104);
    private static final long ButtonR2 = Key_androidKt.Key(105);
    private static final long ButtonThumbLeft = Key_androidKt.Key(106);
    private static final long ButtonThumbRight = Key_androidKt.Key(107);
    private static final long ButtonStart = Key_androidKt.Key(108);
    private static final long ButtonSelect = Key_androidKt.Key(109);
    private static final long ButtonMode = Key_androidKt.Key(110);
    private static final long Button1 = Key_androidKt.Key(188);
    private static final long Button2 = Key_androidKt.Key(PsExtractor.PRIVATE_STREAM_1);
    private static final long Button3 = Key_androidKt.Key(190);
    private static final long Button4 = Key_androidKt.Key(191);
    private static final long Button5 = Key_androidKt.Key(PsExtractor.AUDIO_STREAM);
    private static final long Button6 = Key_androidKt.Key(193);
    private static final long Button7 = Key_androidKt.Key(194);
    private static final long Button8 = Key_androidKt.Key(195);
    private static final long Button9 = Key_androidKt.Key(196);
    private static final long Button10 = Key_androidKt.Key(197);
    private static final long Button11 = Key_androidKt.Key(198);
    private static final long Button12 = Key_androidKt.Key(199);
    private static final long Button13 = Key_androidKt.Key(200);
    private static final long Button14 = Key_androidKt.Key(ComposerKt.providerKey);
    private static final long Button15 = Key_androidKt.Key(ComposerKt.compositionLocalMapKey);
    private static final long Button16 = Key_androidKt.Key(ComposerKt.providerValuesKey);
    private static final long Forward = Key_androidKt.Key(125);

    /* renamed from: F1, reason: collision with root package name */
    private static final long f14489F1 = Key_androidKt.Key(131);

    /* renamed from: F2, reason: collision with root package name */
    private static final long f14490F2 = Key_androidKt.Key(132);

    /* renamed from: F3, reason: collision with root package name */
    private static final long f14491F3 = Key_androidKt.Key(133);

    /* renamed from: F4, reason: collision with root package name */
    private static final long f14492F4 = Key_androidKt.Key(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);

    /* renamed from: F5, reason: collision with root package name */
    private static final long f14493F5 = Key_androidKt.Key(TsExtractor.TS_STREAM_TYPE_E_AC3);

    /* renamed from: F6, reason: collision with root package name */
    private static final long f14494F6 = Key_androidKt.Key(136);

    /* renamed from: F7, reason: collision with root package name */
    private static final long f14495F7 = Key_androidKt.Key(137);
    private static final long F8 = Key_androidKt.Key(TsExtractor.TS_STREAM_TYPE_DTS);
    private static final long F9 = Key_androidKt.Key(139);
    private static final long F10 = Key_androidKt.Key(140);
    private static final long F11 = Key_androidKt.Key(141);
    private static final long F12 = Key_androidKt.Key(142);
    private static final long NumLock = Key_androidKt.Key(143);
    private static final long NumPad0 = Key_androidKt.Key(144);
    private static final long NumPad1 = Key_androidKt.Key(145);
    private static final long NumPad2 = Key_androidKt.Key(146);
    private static final long NumPad3 = Key_androidKt.Key(147);
    private static final long NumPad4 = Key_androidKt.Key(148);
    private static final long NumPad5 = Key_androidKt.Key(149);
    private static final long NumPad6 = Key_androidKt.Key(150);
    private static final long NumPad7 = Key_androidKt.Key(151);
    private static final long NumPad8 = Key_androidKt.Key(152);
    private static final long NumPad9 = Key_androidKt.Key(153);
    private static final long NumPadDivide = Key_androidKt.Key(154);
    private static final long NumPadMultiply = Key_androidKt.Key(155);
    private static final long NumPadSubtract = Key_androidKt.Key(156);
    private static final long NumPadAdd = Key_androidKt.Key(157);
    private static final long NumPadDot = Key_androidKt.Key(158);
    private static final long NumPadComma = Key_androidKt.Key(159);
    private static final long NumPadEnter = Key_androidKt.Key(160);
    private static final long NumPadEquals = Key_androidKt.Key(161);
    private static final long NumPadLeftParenthesis = Key_androidKt.Key(162);
    private static final long NumPadRightParenthesis = Key_androidKt.Key(163);
    private static final long MediaPlay = Key_androidKt.Key(126);
    private static final long MediaPause = Key_androidKt.Key(ModuleDescriptor.MODULE_VERSION);
    private static final long MediaPlayPause = Key_androidKt.Key(85);
    private static final long MediaStop = Key_androidKt.Key(86);
    private static final long MediaRecord = Key_androidKt.Key(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
    private static final long MediaNext = Key_androidKt.Key(87);
    private static final long MediaPrevious = Key_androidKt.Key(88);
    private static final long MediaRewind = Key_androidKt.Key(89);
    private static final long MediaFastForward = Key_androidKt.Key(90);
    private static final long MediaClose = Key_androidKt.Key(128);
    private static final long MediaAudioTrack = Key_androidKt.Key(222);
    private static final long MediaEject = Key_androidKt.Key(TsExtractor.TS_STREAM_TYPE_AC3);
    private static final long MediaTopMenu = Key_androidKt.Key(226);
    private static final long MediaSkipForward = Key_androidKt.Key(272);
    private static final long MediaSkipBackward = Key_androidKt.Key(273);
    private static final long MediaStepForward = Key_androidKt.Key(274);
    private static final long MediaStepBackward = Key_androidKt.Key(275);
    private static final long MicrophoneMute = Key_androidKt.Key(91);
    private static final long VolumeMute = Key_androidKt.Key(164);
    private static final long Info = Key_androidKt.Key(165);
    private static final long ChannelUp = Key_androidKt.Key(166);
    private static final long ChannelDown = Key_androidKt.Key(167);
    private static final long ZoomIn = Key_androidKt.Key(168);
    private static final long ZoomOut = Key_androidKt.Key(169);
    private static final long Tv = Key_androidKt.Key(170);
    private static final long Window = Key_androidKt.Key(171);
    private static final long Guide = Key_androidKt.Key(172);
    private static final long Dvr = Key_androidKt.Key(173);
    private static final long Bookmark = Key_androidKt.Key(174);
    private static final long Captions = Key_androidKt.Key(175);
    private static final long Settings = Key_androidKt.Key(176);
    private static final long TvPower = Key_androidKt.Key(177);
    private static final long TvInput = Key_androidKt.Key(178);
    private static final long SetTopBoxPower = Key_androidKt.Key(179);
    private static final long SetTopBoxInput = Key_androidKt.Key(SubsamplingScaleImageView.ORIENTATION_180);
    private static final long AvReceiverPower = Key_androidKt.Key(181);
    private static final long AvReceiverInput = Key_androidKt.Key(182);
    private static final long ProgramRed = Key_androidKt.Key(183);
    private static final long ProgramGreen = Key_androidKt.Key(184);
    private static final long ProgramYellow = Key_androidKt.Key(185);
    private static final long ProgramBlue = Key_androidKt.Key(186);
    private static final long AppSwitch = Key_androidKt.Key(187);
    private static final long LanguageSwitch = Key_androidKt.Key(ComposerKt.providerMapsKey);
    private static final long MannerMode = Key_androidKt.Key(205);
    private static final long Toggle2D3D = Key_androidKt.Key(ComposerKt.referenceKey);
    private static final long Contacts = Key_androidKt.Key(ComposerKt.reuseKey);
    private static final long Calendar = Key_androidKt.Key(208);
    private static final long Music = Key_androidKt.Key(209);
    private static final long Calculator = Key_androidKt.Key(210);
    private static final long ZenkakuHankaru = Key_androidKt.Key(211);
    private static final long Eisu = Key_androidKt.Key(212);
    private static final long Muhenkan = Key_androidKt.Key(213);
    private static final long Henkan = Key_androidKt.Key(214);
    private static final long KatakanaHiragana = Key_androidKt.Key(215);
    private static final long Yen = Key_androidKt.Key(216);
    private static final long Ro = Key_androidKt.Key(217);
    private static final long Kana = Key_androidKt.Key(218);
    private static final long Assist = Key_androidKt.Key(219);
    private static final long BrightnessDown = Key_androidKt.Key(220);
    private static final long BrightnessUp = Key_androidKt.Key(221);
    private static final long Sleep = Key_androidKt.Key(223);
    private static final long WakeUp = Key_androidKt.Key(224);
    private static final long SoftSleep = Key_androidKt.Key(276);
    private static final long Pairing = Key_androidKt.Key(225);
    private static final long LastChannel = Key_androidKt.Key(229);
    private static final long TvDataService = Key_androidKt.Key(230);
    private static final long VoiceAssist = Key_androidKt.Key(231);
    private static final long TvRadioService = Key_androidKt.Key(232);
    private static final long TvTeletext = Key_androidKt.Key(233);
    private static final long TvNumberEntry = Key_androidKt.Key(234);
    private static final long TvTerrestrialAnalog = Key_androidKt.Key(235);
    private static final long TvTerrestrialDigital = Key_androidKt.Key(236);
    private static final long TvSatellite = Key_androidKt.Key(237);
    private static final long TvSatelliteBs = Key_androidKt.Key(238);
    private static final long TvSatelliteCs = Key_androidKt.Key(239);
    private static final long TvSatelliteService = Key_androidKt.Key(PsExtractor.VIDEO_STREAM_MASK);
    private static final long TvNetwork = Key_androidKt.Key(241);
    private static final long TvAntennaCable = Key_androidKt.Key(242);
    private static final long TvInputHdmi1 = Key_androidKt.Key(243);
    private static final long TvInputHdmi2 = Key_androidKt.Key(244);
    private static final long TvInputHdmi3 = Key_androidKt.Key(245);
    private static final long TvInputHdmi4 = Key_androidKt.Key(246);
    private static final long TvInputComposite1 = Key_androidKt.Key(247);
    private static final long TvInputComposite2 = Key_androidKt.Key(248);
    private static final long TvInputComponent1 = Key_androidKt.Key(249);
    private static final long TvInputComponent2 = Key_androidKt.Key(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    private static final long TvInputVga1 = Key_androidKt.Key(251);
    private static final long TvAudioDescription = Key_androidKt.Key(252);
    private static final long TvAudioDescriptionMixingVolumeUp = Key_androidKt.Key(253);
    private static final long TvAudioDescriptionMixingVolumeDown = Key_androidKt.Key(254);
    private static final long TvZoomMode = Key_androidKt.Key(255);
    private static final long TvContentsMenu = Key_androidKt.Key(256);
    private static final long TvMediaContextMenu = Key_androidKt.Key(257);
    private static final long TvTimerProgramming = Key_androidKt.Key(258);
    private static final long StemPrimary = Key_androidKt.Key(264);
    private static final long Stem1 = Key_androidKt.Key(265);
    private static final long Stem2 = Key_androidKt.Key(266);
    private static final long Stem3 = Key_androidKt.Key(267);
    private static final long AllApps = Key_androidKt.Key(284);
    private static final long Refresh = Key_androidKt.Key(285);
    private static final long ThumbsUp = Key_androidKt.Key(286);
    private static final long ThumbsDown = Key_androidKt.Key(287);
    private static final long ProfileSwitch = Key_androidKt.Key(288);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getA-EK5gGoQ, reason: not valid java name */
        public final long m3572getAEK5gGoQ() {
            return Key.f14483A;
        }

        /* renamed from: getAllApps-EK5gGoQ, reason: not valid java name */
        public final long m3573getAllAppsEK5gGoQ() {
            return Key.AllApps;
        }

        /* renamed from: getAltLeft-EK5gGoQ, reason: not valid java name */
        public final long m3574getAltLeftEK5gGoQ() {
            return Key.AltLeft;
        }

        /* renamed from: getAltRight-EK5gGoQ, reason: not valid java name */
        public final long m3575getAltRightEK5gGoQ() {
            return Key.AltRight;
        }

        /* renamed from: getApostrophe-EK5gGoQ, reason: not valid java name */
        public final long m3576getApostropheEK5gGoQ() {
            return Key.Apostrophe;
        }

        /* renamed from: getAppSwitch-EK5gGoQ, reason: not valid java name */
        public final long m3577getAppSwitchEK5gGoQ() {
            return Key.AppSwitch;
        }

        /* renamed from: getAssist-EK5gGoQ, reason: not valid java name */
        public final long m3578getAssistEK5gGoQ() {
            return Key.Assist;
        }

        /* renamed from: getAt-EK5gGoQ, reason: not valid java name */
        public final long m3579getAtEK5gGoQ() {
            return Key.At;
        }

        /* renamed from: getAvReceiverInput-EK5gGoQ, reason: not valid java name */
        public final long m3580getAvReceiverInputEK5gGoQ() {
            return Key.AvReceiverInput;
        }

        /* renamed from: getAvReceiverPower-EK5gGoQ, reason: not valid java name */
        public final long m3581getAvReceiverPowerEK5gGoQ() {
            return Key.AvReceiverPower;
        }

        /* renamed from: getB-EK5gGoQ, reason: not valid java name */
        public final long m3582getBEK5gGoQ() {
            return Key.f14484B;
        }

        /* renamed from: getBack-EK5gGoQ, reason: not valid java name */
        public final long m3583getBackEK5gGoQ() {
            return Key.Back;
        }

        /* renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
        public final long m3584getBackslashEK5gGoQ() {
            return Key.Backslash;
        }

        /* renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
        public final long m3585getBackspaceEK5gGoQ() {
            return Key.Backspace;
        }

        /* renamed from: getBookmark-EK5gGoQ, reason: not valid java name */
        public final long m3586getBookmarkEK5gGoQ() {
            return Key.Bookmark;
        }

        /* renamed from: getBreak-EK5gGoQ, reason: not valid java name */
        public final long m3587getBreakEK5gGoQ() {
            return Key.Break;
        }

        /* renamed from: getBrightnessDown-EK5gGoQ, reason: not valid java name */
        public final long m3588getBrightnessDownEK5gGoQ() {
            return Key.BrightnessDown;
        }

        /* renamed from: getBrightnessUp-EK5gGoQ, reason: not valid java name */
        public final long m3589getBrightnessUpEK5gGoQ() {
            return Key.BrightnessUp;
        }

        /* renamed from: getBrowser-EK5gGoQ, reason: not valid java name */
        public final long m3590getBrowserEK5gGoQ() {
            return Key.Browser;
        }

        /* renamed from: getButton1-EK5gGoQ, reason: not valid java name */
        public final long m3591getButton1EK5gGoQ() {
            return Key.Button1;
        }

        /* renamed from: getButton10-EK5gGoQ, reason: not valid java name */
        public final long m3592getButton10EK5gGoQ() {
            return Key.Button10;
        }

        /* renamed from: getButton11-EK5gGoQ, reason: not valid java name */
        public final long m3593getButton11EK5gGoQ() {
            return Key.Button11;
        }

        /* renamed from: getButton12-EK5gGoQ, reason: not valid java name */
        public final long m3594getButton12EK5gGoQ() {
            return Key.Button12;
        }

        /* renamed from: getButton13-EK5gGoQ, reason: not valid java name */
        public final long m3595getButton13EK5gGoQ() {
            return Key.Button13;
        }

        /* renamed from: getButton14-EK5gGoQ, reason: not valid java name */
        public final long m3596getButton14EK5gGoQ() {
            return Key.Button14;
        }

        /* renamed from: getButton15-EK5gGoQ, reason: not valid java name */
        public final long m3597getButton15EK5gGoQ() {
            return Key.Button15;
        }

        /* renamed from: getButton16-EK5gGoQ, reason: not valid java name */
        public final long m3598getButton16EK5gGoQ() {
            return Key.Button16;
        }

        /* renamed from: getButton2-EK5gGoQ, reason: not valid java name */
        public final long m3599getButton2EK5gGoQ() {
            return Key.Button2;
        }

        /* renamed from: getButton3-EK5gGoQ, reason: not valid java name */
        public final long m3600getButton3EK5gGoQ() {
            return Key.Button3;
        }

        /* renamed from: getButton4-EK5gGoQ, reason: not valid java name */
        public final long m3601getButton4EK5gGoQ() {
            return Key.Button4;
        }

        /* renamed from: getButton5-EK5gGoQ, reason: not valid java name */
        public final long m3602getButton5EK5gGoQ() {
            return Key.Button5;
        }

        /* renamed from: getButton6-EK5gGoQ, reason: not valid java name */
        public final long m3603getButton6EK5gGoQ() {
            return Key.Button6;
        }

        /* renamed from: getButton7-EK5gGoQ, reason: not valid java name */
        public final long m3604getButton7EK5gGoQ() {
            return Key.Button7;
        }

        /* renamed from: getButton8-EK5gGoQ, reason: not valid java name */
        public final long m3605getButton8EK5gGoQ() {
            return Key.Button8;
        }

        /* renamed from: getButton9-EK5gGoQ, reason: not valid java name */
        public final long m3606getButton9EK5gGoQ() {
            return Key.Button9;
        }

        /* renamed from: getButtonA-EK5gGoQ, reason: not valid java name */
        public final long m3607getButtonAEK5gGoQ() {
            return Key.ButtonA;
        }

        /* renamed from: getButtonB-EK5gGoQ, reason: not valid java name */
        public final long m3608getButtonBEK5gGoQ() {
            return Key.ButtonB;
        }

        /* renamed from: getButtonC-EK5gGoQ, reason: not valid java name */
        public final long m3609getButtonCEK5gGoQ() {
            return Key.ButtonC;
        }

        /* renamed from: getButtonL1-EK5gGoQ, reason: not valid java name */
        public final long m3610getButtonL1EK5gGoQ() {
            return Key.ButtonL1;
        }

        /* renamed from: getButtonL2-EK5gGoQ, reason: not valid java name */
        public final long m3611getButtonL2EK5gGoQ() {
            return Key.ButtonL2;
        }

        /* renamed from: getButtonMode-EK5gGoQ, reason: not valid java name */
        public final long m3612getButtonModeEK5gGoQ() {
            return Key.ButtonMode;
        }

        /* renamed from: getButtonR1-EK5gGoQ, reason: not valid java name */
        public final long m3613getButtonR1EK5gGoQ() {
            return Key.ButtonR1;
        }

        /* renamed from: getButtonR2-EK5gGoQ, reason: not valid java name */
        public final long m3614getButtonR2EK5gGoQ() {
            return Key.ButtonR2;
        }

        /* renamed from: getButtonSelect-EK5gGoQ, reason: not valid java name */
        public final long m3615getButtonSelectEK5gGoQ() {
            return Key.ButtonSelect;
        }

        /* renamed from: getButtonStart-EK5gGoQ, reason: not valid java name */
        public final long m3616getButtonStartEK5gGoQ() {
            return Key.ButtonStart;
        }

        /* renamed from: getButtonThumbLeft-EK5gGoQ, reason: not valid java name */
        public final long m3617getButtonThumbLeftEK5gGoQ() {
            return Key.ButtonThumbLeft;
        }

        /* renamed from: getButtonThumbRight-EK5gGoQ, reason: not valid java name */
        public final long m3618getButtonThumbRightEK5gGoQ() {
            return Key.ButtonThumbRight;
        }

        /* renamed from: getButtonX-EK5gGoQ, reason: not valid java name */
        public final long m3619getButtonXEK5gGoQ() {
            return Key.ButtonX;
        }

        /* renamed from: getButtonY-EK5gGoQ, reason: not valid java name */
        public final long m3620getButtonYEK5gGoQ() {
            return Key.ButtonY;
        }

        /* renamed from: getButtonZ-EK5gGoQ, reason: not valid java name */
        public final long m3621getButtonZEK5gGoQ() {
            return Key.ButtonZ;
        }

        /* renamed from: getC-EK5gGoQ, reason: not valid java name */
        public final long m3622getCEK5gGoQ() {
            return Key.f14485C;
        }

        /* renamed from: getCalculator-EK5gGoQ, reason: not valid java name */
        public final long m3623getCalculatorEK5gGoQ() {
            return Key.Calculator;
        }

        /* renamed from: getCalendar-EK5gGoQ, reason: not valid java name */
        public final long m3624getCalendarEK5gGoQ() {
            return Key.Calendar;
        }

        /* renamed from: getCall-EK5gGoQ, reason: not valid java name */
        public final long m3625getCallEK5gGoQ() {
            return Key.Call;
        }

        /* renamed from: getCamera-EK5gGoQ, reason: not valid java name */
        public final long m3626getCameraEK5gGoQ() {
            return Key.Camera;
        }

        /* renamed from: getCapsLock-EK5gGoQ, reason: not valid java name */
        public final long m3627getCapsLockEK5gGoQ() {
            return Key.CapsLock;
        }

        /* renamed from: getCaptions-EK5gGoQ, reason: not valid java name */
        public final long m3628getCaptionsEK5gGoQ() {
            return Key.Captions;
        }

        /* renamed from: getChannelDown-EK5gGoQ, reason: not valid java name */
        public final long m3629getChannelDownEK5gGoQ() {
            return Key.ChannelDown;
        }

        /* renamed from: getChannelUp-EK5gGoQ, reason: not valid java name */
        public final long m3630getChannelUpEK5gGoQ() {
            return Key.ChannelUp;
        }

        /* renamed from: getClear-EK5gGoQ, reason: not valid java name */
        public final long m3631getClearEK5gGoQ() {
            return Key.Clear;
        }

        /* renamed from: getComma-EK5gGoQ, reason: not valid java name */
        public final long m3632getCommaEK5gGoQ() {
            return Key.Comma;
        }

        /* renamed from: getContacts-EK5gGoQ, reason: not valid java name */
        public final long m3633getContactsEK5gGoQ() {
            return Key.Contacts;
        }

        /* renamed from: getCopy-EK5gGoQ, reason: not valid java name */
        public final long m3634getCopyEK5gGoQ() {
            return Key.Copy;
        }

        /* renamed from: getCtrlLeft-EK5gGoQ, reason: not valid java name */
        public final long m3635getCtrlLeftEK5gGoQ() {
            return Key.CtrlLeft;
        }

        /* renamed from: getCtrlRight-EK5gGoQ, reason: not valid java name */
        public final long m3636getCtrlRightEK5gGoQ() {
            return Key.CtrlRight;
        }

        /* renamed from: getCut-EK5gGoQ, reason: not valid java name */
        public final long m3637getCutEK5gGoQ() {
            return Key.Cut;
        }

        /* renamed from: getD-EK5gGoQ, reason: not valid java name */
        public final long m3638getDEK5gGoQ() {
            return Key.f14486D;
        }

        /* renamed from: getDelete-EK5gGoQ, reason: not valid java name */
        public final long m3639getDeleteEK5gGoQ() {
            return Key.Delete;
        }

        /* renamed from: getDirectionCenter-EK5gGoQ, reason: not valid java name */
        public final long m3640getDirectionCenterEK5gGoQ() {
            return Key.DirectionCenter;
        }

        /* renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
        public final long m3641getDirectionDownEK5gGoQ() {
            return Key.DirectionDown;
        }

        /* renamed from: getDirectionDownLeft-EK5gGoQ, reason: not valid java name */
        public final long m3642getDirectionDownLeftEK5gGoQ() {
            return Key.DirectionDownLeft;
        }

        /* renamed from: getDirectionDownRight-EK5gGoQ, reason: not valid java name */
        public final long m3643getDirectionDownRightEK5gGoQ() {
            return Key.DirectionDownRight;
        }

        /* renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
        public final long m3644getDirectionLeftEK5gGoQ() {
            return Key.DirectionLeft;
        }

        /* renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
        public final long m3645getDirectionRightEK5gGoQ() {
            return Key.DirectionRight;
        }

        /* renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
        public final long m3646getDirectionUpEK5gGoQ() {
            return Key.DirectionUp;
        }

        /* renamed from: getDirectionUpLeft-EK5gGoQ, reason: not valid java name */
        public final long m3647getDirectionUpLeftEK5gGoQ() {
            return Key.DirectionUpLeft;
        }

        /* renamed from: getDirectionUpRight-EK5gGoQ, reason: not valid java name */
        public final long m3648getDirectionUpRightEK5gGoQ() {
            return Key.DirectionUpRight;
        }

        /* renamed from: getDvr-EK5gGoQ, reason: not valid java name */
        public final long m3649getDvrEK5gGoQ() {
            return Key.Dvr;
        }

        /* renamed from: getE-EK5gGoQ, reason: not valid java name */
        public final long m3650getEEK5gGoQ() {
            return Key.f14487E;
        }

        /* renamed from: getEight-EK5gGoQ, reason: not valid java name */
        public final long m3651getEightEK5gGoQ() {
            return Key.Eight;
        }

        /* renamed from: getEisu-EK5gGoQ, reason: not valid java name */
        public final long m3652getEisuEK5gGoQ() {
            return Key.Eisu;
        }

        /* renamed from: getEndCall-EK5gGoQ, reason: not valid java name */
        public final long m3653getEndCallEK5gGoQ() {
            return Key.EndCall;
        }

        /* renamed from: getEnter-EK5gGoQ, reason: not valid java name */
        public final long m3654getEnterEK5gGoQ() {
            return Key.Enter;
        }

        /* renamed from: getEnvelope-EK5gGoQ, reason: not valid java name */
        public final long m3655getEnvelopeEK5gGoQ() {
            return Key.Envelope;
        }

        /* renamed from: getEquals-EK5gGoQ, reason: not valid java name */
        public final long m3656getEqualsEK5gGoQ() {
            return Key.Equals;
        }

        /* renamed from: getEscape-EK5gGoQ, reason: not valid java name */
        public final long m3657getEscapeEK5gGoQ() {
            return Key.Escape;
        }

        /* renamed from: getF-EK5gGoQ, reason: not valid java name */
        public final long m3658getFEK5gGoQ() {
            return Key.f14488F;
        }

        /* renamed from: getF1-EK5gGoQ, reason: not valid java name */
        public final long m3659getF1EK5gGoQ() {
            return Key.f14489F1;
        }

        /* renamed from: getF10-EK5gGoQ, reason: not valid java name */
        public final long m3660getF10EK5gGoQ() {
            return Key.F10;
        }

        /* renamed from: getF11-EK5gGoQ, reason: not valid java name */
        public final long m3661getF11EK5gGoQ() {
            return Key.F11;
        }

        /* renamed from: getF12-EK5gGoQ, reason: not valid java name */
        public final long m3662getF12EK5gGoQ() {
            return Key.F12;
        }

        /* renamed from: getF2-EK5gGoQ, reason: not valid java name */
        public final long m3663getF2EK5gGoQ() {
            return Key.f14490F2;
        }

        /* renamed from: getF3-EK5gGoQ, reason: not valid java name */
        public final long m3664getF3EK5gGoQ() {
            return Key.f14491F3;
        }

        /* renamed from: getF4-EK5gGoQ, reason: not valid java name */
        public final long m3665getF4EK5gGoQ() {
            return Key.f14492F4;
        }

        /* renamed from: getF5-EK5gGoQ, reason: not valid java name */
        public final long m3666getF5EK5gGoQ() {
            return Key.f14493F5;
        }

        /* renamed from: getF6-EK5gGoQ, reason: not valid java name */
        public final long m3667getF6EK5gGoQ() {
            return Key.f14494F6;
        }

        /* renamed from: getF7-EK5gGoQ, reason: not valid java name */
        public final long m3668getF7EK5gGoQ() {
            return Key.f14495F7;
        }

        /* renamed from: getF8-EK5gGoQ, reason: not valid java name */
        public final long m3669getF8EK5gGoQ() {
            return Key.F8;
        }

        /* renamed from: getF9-EK5gGoQ, reason: not valid java name */
        public final long m3670getF9EK5gGoQ() {
            return Key.F9;
        }

        /* renamed from: getFive-EK5gGoQ, reason: not valid java name */
        public final long m3671getFiveEK5gGoQ() {
            return Key.Five;
        }

        /* renamed from: getFocus-EK5gGoQ, reason: not valid java name */
        public final long m3672getFocusEK5gGoQ() {
            return Key.Focus;
        }

        /* renamed from: getForward-EK5gGoQ, reason: not valid java name */
        public final long m3673getForwardEK5gGoQ() {
            return Key.Forward;
        }

        /* renamed from: getFour-EK5gGoQ, reason: not valid java name */
        public final long m3674getFourEK5gGoQ() {
            return Key.Four;
        }

        /* renamed from: getFunction-EK5gGoQ, reason: not valid java name */
        public final long m3675getFunctionEK5gGoQ() {
            return Key.Function;
        }

        /* renamed from: getG-EK5gGoQ, reason: not valid java name */
        public final long m3676getGEK5gGoQ() {
            return Key.f14496G;
        }

        /* renamed from: getGrave-EK5gGoQ, reason: not valid java name */
        public final long m3677getGraveEK5gGoQ() {
            return Key.Grave;
        }

        /* renamed from: getGuide-EK5gGoQ, reason: not valid java name */
        public final long m3678getGuideEK5gGoQ() {
            return Key.Guide;
        }

        /* renamed from: getH-EK5gGoQ, reason: not valid java name */
        public final long m3679getHEK5gGoQ() {
            return Key.f14497H;
        }

        /* renamed from: getHeadsetHook-EK5gGoQ, reason: not valid java name */
        public final long m3680getHeadsetHookEK5gGoQ() {
            return Key.HeadsetHook;
        }

        /* renamed from: getHelp-EK5gGoQ, reason: not valid java name */
        public final long m3681getHelpEK5gGoQ() {
            return Key.Help;
        }

        /* renamed from: getHenkan-EK5gGoQ, reason: not valid java name */
        public final long m3682getHenkanEK5gGoQ() {
            return Key.Henkan;
        }

        /* renamed from: getHome-EK5gGoQ, reason: not valid java name */
        public final long m3683getHomeEK5gGoQ() {
            return Key.Home;
        }

        /* renamed from: getI-EK5gGoQ, reason: not valid java name */
        public final long m3684getIEK5gGoQ() {
            return Key.f14498I;
        }

        /* renamed from: getInfo-EK5gGoQ, reason: not valid java name */
        public final long m3685getInfoEK5gGoQ() {
            return Key.Info;
        }

        /* renamed from: getInsert-EK5gGoQ, reason: not valid java name */
        public final long m3686getInsertEK5gGoQ() {
            return Key.Insert;
        }

        /* renamed from: getJ-EK5gGoQ, reason: not valid java name */
        public final long m3687getJEK5gGoQ() {
            return Key.f14499J;
        }

        /* renamed from: getK-EK5gGoQ, reason: not valid java name */
        public final long m3688getKEK5gGoQ() {
            return Key.f14500K;
        }

        /* renamed from: getKana-EK5gGoQ, reason: not valid java name */
        public final long m3689getKanaEK5gGoQ() {
            return Key.Kana;
        }

        /* renamed from: getKatakanaHiragana-EK5gGoQ, reason: not valid java name */
        public final long m3690getKatakanaHiraganaEK5gGoQ() {
            return Key.KatakanaHiragana;
        }

        /* renamed from: getL-EK5gGoQ, reason: not valid java name */
        public final long m3691getLEK5gGoQ() {
            return Key.f14501L;
        }

        /* renamed from: getLanguageSwitch-EK5gGoQ, reason: not valid java name */
        public final long m3692getLanguageSwitchEK5gGoQ() {
            return Key.LanguageSwitch;
        }

        /* renamed from: getLastChannel-EK5gGoQ, reason: not valid java name */
        public final long m3693getLastChannelEK5gGoQ() {
            return Key.LastChannel;
        }

        /* renamed from: getLeftBracket-EK5gGoQ, reason: not valid java name */
        public final long m3694getLeftBracketEK5gGoQ() {
            return Key.LeftBracket;
        }

        /* renamed from: getM-EK5gGoQ, reason: not valid java name */
        public final long m3695getMEK5gGoQ() {
            return Key.f14502M;
        }

        /* renamed from: getMannerMode-EK5gGoQ, reason: not valid java name */
        public final long m3696getMannerModeEK5gGoQ() {
            return Key.MannerMode;
        }

        /* renamed from: getMediaAudioTrack-EK5gGoQ, reason: not valid java name */
        public final long m3697getMediaAudioTrackEK5gGoQ() {
            return Key.MediaAudioTrack;
        }

        /* renamed from: getMediaClose-EK5gGoQ, reason: not valid java name */
        public final long m3698getMediaCloseEK5gGoQ() {
            return Key.MediaClose;
        }

        /* renamed from: getMediaEject-EK5gGoQ, reason: not valid java name */
        public final long m3699getMediaEjectEK5gGoQ() {
            return Key.MediaEject;
        }

        /* renamed from: getMediaFastForward-EK5gGoQ, reason: not valid java name */
        public final long m3700getMediaFastForwardEK5gGoQ() {
            return Key.MediaFastForward;
        }

        /* renamed from: getMediaNext-EK5gGoQ, reason: not valid java name */
        public final long m3701getMediaNextEK5gGoQ() {
            return Key.MediaNext;
        }

        /* renamed from: getMediaPause-EK5gGoQ, reason: not valid java name */
        public final long m3702getMediaPauseEK5gGoQ() {
            return Key.MediaPause;
        }

        /* renamed from: getMediaPlay-EK5gGoQ, reason: not valid java name */
        public final long m3703getMediaPlayEK5gGoQ() {
            return Key.MediaPlay;
        }

        /* renamed from: getMediaPlayPause-EK5gGoQ, reason: not valid java name */
        public final long m3704getMediaPlayPauseEK5gGoQ() {
            return Key.MediaPlayPause;
        }

        /* renamed from: getMediaPrevious-EK5gGoQ, reason: not valid java name */
        public final long m3705getMediaPreviousEK5gGoQ() {
            return Key.MediaPrevious;
        }

        /* renamed from: getMediaRecord-EK5gGoQ, reason: not valid java name */
        public final long m3706getMediaRecordEK5gGoQ() {
            return Key.MediaRecord;
        }

        /* renamed from: getMediaRewind-EK5gGoQ, reason: not valid java name */
        public final long m3707getMediaRewindEK5gGoQ() {
            return Key.MediaRewind;
        }

        /* renamed from: getMediaSkipBackward-EK5gGoQ, reason: not valid java name */
        public final long m3708getMediaSkipBackwardEK5gGoQ() {
            return Key.MediaSkipBackward;
        }

        /* renamed from: getMediaSkipForward-EK5gGoQ, reason: not valid java name */
        public final long m3709getMediaSkipForwardEK5gGoQ() {
            return Key.MediaSkipForward;
        }

        /* renamed from: getMediaStepBackward-EK5gGoQ, reason: not valid java name */
        public final long m3710getMediaStepBackwardEK5gGoQ() {
            return Key.MediaStepBackward;
        }

        /* renamed from: getMediaStepForward-EK5gGoQ, reason: not valid java name */
        public final long m3711getMediaStepForwardEK5gGoQ() {
            return Key.MediaStepForward;
        }

        /* renamed from: getMediaStop-EK5gGoQ, reason: not valid java name */
        public final long m3712getMediaStopEK5gGoQ() {
            return Key.MediaStop;
        }

        /* renamed from: getMediaTopMenu-EK5gGoQ, reason: not valid java name */
        public final long m3713getMediaTopMenuEK5gGoQ() {
            return Key.MediaTopMenu;
        }

        /* renamed from: getMenu-EK5gGoQ, reason: not valid java name */
        public final long m3714getMenuEK5gGoQ() {
            return Key.Menu;
        }

        /* renamed from: getMetaLeft-EK5gGoQ, reason: not valid java name */
        public final long m3715getMetaLeftEK5gGoQ() {
            return Key.MetaLeft;
        }

        /* renamed from: getMetaRight-EK5gGoQ, reason: not valid java name */
        public final long m3716getMetaRightEK5gGoQ() {
            return Key.MetaRight;
        }

        /* renamed from: getMicrophoneMute-EK5gGoQ, reason: not valid java name */
        public final long m3717getMicrophoneMuteEK5gGoQ() {
            return Key.MicrophoneMute;
        }

        /* renamed from: getMinus-EK5gGoQ, reason: not valid java name */
        public final long m3718getMinusEK5gGoQ() {
            return Key.Minus;
        }

        /* renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
        public final long m3719getMoveEndEK5gGoQ() {
            return Key.MoveEnd;
        }

        /* renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
        public final long m3720getMoveHomeEK5gGoQ() {
            return Key.MoveHome;
        }

        /* renamed from: getMuhenkan-EK5gGoQ, reason: not valid java name */
        public final long m3721getMuhenkanEK5gGoQ() {
            return Key.Muhenkan;
        }

        /* renamed from: getMultiply-EK5gGoQ, reason: not valid java name */
        public final long m3722getMultiplyEK5gGoQ() {
            return Key.Multiply;
        }

        /* renamed from: getMusic-EK5gGoQ, reason: not valid java name */
        public final long m3723getMusicEK5gGoQ() {
            return Key.Music;
        }

        /* renamed from: getN-EK5gGoQ, reason: not valid java name */
        public final long m3724getNEK5gGoQ() {
            return Key.f14503N;
        }

        /* renamed from: getNavigateIn-EK5gGoQ, reason: not valid java name */
        public final long m3725getNavigateInEK5gGoQ() {
            return Key.NavigateIn;
        }

        /* renamed from: getNavigateNext-EK5gGoQ, reason: not valid java name */
        public final long m3726getNavigateNextEK5gGoQ() {
            return Key.NavigateNext;
        }

        /* renamed from: getNavigateOut-EK5gGoQ, reason: not valid java name */
        public final long m3727getNavigateOutEK5gGoQ() {
            return Key.NavigateOut;
        }

        /* renamed from: getNavigatePrevious-EK5gGoQ, reason: not valid java name */
        public final long m3728getNavigatePreviousEK5gGoQ() {
            return Key.NavigatePrevious;
        }

        /* renamed from: getNine-EK5gGoQ, reason: not valid java name */
        public final long m3729getNineEK5gGoQ() {
            return Key.Nine;
        }

        /* renamed from: getNotification-EK5gGoQ, reason: not valid java name */
        public final long m3730getNotificationEK5gGoQ() {
            return Key.Notification;
        }

        /* renamed from: getNumLock-EK5gGoQ, reason: not valid java name */
        public final long m3731getNumLockEK5gGoQ() {
            return Key.NumLock;
        }

        /* renamed from: getNumPad0-EK5gGoQ, reason: not valid java name */
        public final long m3732getNumPad0EK5gGoQ() {
            return Key.NumPad0;
        }

        /* renamed from: getNumPad1-EK5gGoQ, reason: not valid java name */
        public final long m3733getNumPad1EK5gGoQ() {
            return Key.NumPad1;
        }

        /* renamed from: getNumPad2-EK5gGoQ, reason: not valid java name */
        public final long m3734getNumPad2EK5gGoQ() {
            return Key.NumPad2;
        }

        /* renamed from: getNumPad3-EK5gGoQ, reason: not valid java name */
        public final long m3735getNumPad3EK5gGoQ() {
            return Key.NumPad3;
        }

        /* renamed from: getNumPad4-EK5gGoQ, reason: not valid java name */
        public final long m3736getNumPad4EK5gGoQ() {
            return Key.NumPad4;
        }

        /* renamed from: getNumPad5-EK5gGoQ, reason: not valid java name */
        public final long m3737getNumPad5EK5gGoQ() {
            return Key.NumPad5;
        }

        /* renamed from: getNumPad6-EK5gGoQ, reason: not valid java name */
        public final long m3738getNumPad6EK5gGoQ() {
            return Key.NumPad6;
        }

        /* renamed from: getNumPad7-EK5gGoQ, reason: not valid java name */
        public final long m3739getNumPad7EK5gGoQ() {
            return Key.NumPad7;
        }

        /* renamed from: getNumPad8-EK5gGoQ, reason: not valid java name */
        public final long m3740getNumPad8EK5gGoQ() {
            return Key.NumPad8;
        }

        /* renamed from: getNumPad9-EK5gGoQ, reason: not valid java name */
        public final long m3741getNumPad9EK5gGoQ() {
            return Key.NumPad9;
        }

        /* renamed from: getNumPadAdd-EK5gGoQ, reason: not valid java name */
        public final long m3742getNumPadAddEK5gGoQ() {
            return Key.NumPadAdd;
        }

        /* renamed from: getNumPadComma-EK5gGoQ, reason: not valid java name */
        public final long m3743getNumPadCommaEK5gGoQ() {
            return Key.NumPadComma;
        }

        /* renamed from: getNumPadDivide-EK5gGoQ, reason: not valid java name */
        public final long m3744getNumPadDivideEK5gGoQ() {
            return Key.NumPadDivide;
        }

        /* renamed from: getNumPadDot-EK5gGoQ, reason: not valid java name */
        public final long m3745getNumPadDotEK5gGoQ() {
            return Key.NumPadDot;
        }

        /* renamed from: getNumPadEnter-EK5gGoQ, reason: not valid java name */
        public final long m3746getNumPadEnterEK5gGoQ() {
            return Key.NumPadEnter;
        }

        /* renamed from: getNumPadEquals-EK5gGoQ, reason: not valid java name */
        public final long m3747getNumPadEqualsEK5gGoQ() {
            return Key.NumPadEquals;
        }

        /* renamed from: getNumPadLeftParenthesis-EK5gGoQ, reason: not valid java name */
        public final long m3748getNumPadLeftParenthesisEK5gGoQ() {
            return Key.NumPadLeftParenthesis;
        }

        /* renamed from: getNumPadMultiply-EK5gGoQ, reason: not valid java name */
        public final long m3749getNumPadMultiplyEK5gGoQ() {
            return Key.NumPadMultiply;
        }

        /* renamed from: getNumPadRightParenthesis-EK5gGoQ, reason: not valid java name */
        public final long m3750getNumPadRightParenthesisEK5gGoQ() {
            return Key.NumPadRightParenthesis;
        }

        /* renamed from: getNumPadSubtract-EK5gGoQ, reason: not valid java name */
        public final long m3751getNumPadSubtractEK5gGoQ() {
            return Key.NumPadSubtract;
        }

        /* renamed from: getNumber-EK5gGoQ, reason: not valid java name */
        public final long m3752getNumberEK5gGoQ() {
            return Key.Number;
        }

        /* renamed from: getO-EK5gGoQ, reason: not valid java name */
        public final long m3753getOEK5gGoQ() {
            return Key.f14504O;
        }

        /* renamed from: getOne-EK5gGoQ, reason: not valid java name */
        public final long m3754getOneEK5gGoQ() {
            return Key.One;
        }

        /* renamed from: getP-EK5gGoQ, reason: not valid java name */
        public final long m3755getPEK5gGoQ() {
            return Key.f14505P;
        }

        /* renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
        public final long m3756getPageDownEK5gGoQ() {
            return Key.PageDown;
        }

        /* renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
        public final long m3757getPageUpEK5gGoQ() {
            return Key.PageUp;
        }

        /* renamed from: getPairing-EK5gGoQ, reason: not valid java name */
        public final long m3758getPairingEK5gGoQ() {
            return Key.Pairing;
        }

        /* renamed from: getPaste-EK5gGoQ, reason: not valid java name */
        public final long m3759getPasteEK5gGoQ() {
            return Key.Paste;
        }

        /* renamed from: getPeriod-EK5gGoQ, reason: not valid java name */
        public final long m3760getPeriodEK5gGoQ() {
            return Key.Period;
        }

        /* renamed from: getPictureSymbols-EK5gGoQ, reason: not valid java name */
        public final long m3761getPictureSymbolsEK5gGoQ() {
            return Key.PictureSymbols;
        }

        /* renamed from: getPlus-EK5gGoQ, reason: not valid java name */
        public final long m3762getPlusEK5gGoQ() {
            return Key.Plus;
        }

        /* renamed from: getPound-EK5gGoQ, reason: not valid java name */
        public final long m3763getPoundEK5gGoQ() {
            return Key.Pound;
        }

        /* renamed from: getPower-EK5gGoQ, reason: not valid java name */
        public final long m3764getPowerEK5gGoQ() {
            return Key.Power;
        }

        /* renamed from: getPrintScreen-EK5gGoQ, reason: not valid java name */
        public final long m3765getPrintScreenEK5gGoQ() {
            return Key.PrintScreen;
        }

        /* renamed from: getProfileSwitch-EK5gGoQ, reason: not valid java name */
        public final long m3766getProfileSwitchEK5gGoQ() {
            return Key.ProfileSwitch;
        }

        /* renamed from: getProgramBlue-EK5gGoQ, reason: not valid java name */
        public final long m3767getProgramBlueEK5gGoQ() {
            return Key.ProgramBlue;
        }

        /* renamed from: getProgramGreen-EK5gGoQ, reason: not valid java name */
        public final long m3768getProgramGreenEK5gGoQ() {
            return Key.ProgramGreen;
        }

        /* renamed from: getProgramRed-EK5gGoQ, reason: not valid java name */
        public final long m3769getProgramRedEK5gGoQ() {
            return Key.ProgramRed;
        }

        /* renamed from: getProgramYellow-EK5gGoQ, reason: not valid java name */
        public final long m3770getProgramYellowEK5gGoQ() {
            return Key.ProgramYellow;
        }

        /* renamed from: getQ-EK5gGoQ, reason: not valid java name */
        public final long m3771getQEK5gGoQ() {
            return Key.f14506Q;
        }

        /* renamed from: getR-EK5gGoQ, reason: not valid java name */
        public final long m3772getREK5gGoQ() {
            return Key.f14507R;
        }

        /* renamed from: getRefresh-EK5gGoQ, reason: not valid java name */
        public final long m3773getRefreshEK5gGoQ() {
            return Key.Refresh;
        }

        /* renamed from: getRightBracket-EK5gGoQ, reason: not valid java name */
        public final long m3774getRightBracketEK5gGoQ() {
            return Key.RightBracket;
        }

        /* renamed from: getRo-EK5gGoQ, reason: not valid java name */
        public final long m3775getRoEK5gGoQ() {
            return Key.Ro;
        }

        /* renamed from: getS-EK5gGoQ, reason: not valid java name */
        public final long m3776getSEK5gGoQ() {
            return Key.f14508S;
        }

        /* renamed from: getScrollLock-EK5gGoQ, reason: not valid java name */
        public final long m3777getScrollLockEK5gGoQ() {
            return Key.ScrollLock;
        }

        /* renamed from: getSearch-EK5gGoQ, reason: not valid java name */
        public final long m3778getSearchEK5gGoQ() {
            return Key.Search;
        }

        /* renamed from: getSemicolon-EK5gGoQ, reason: not valid java name */
        public final long m3779getSemicolonEK5gGoQ() {
            return Key.Semicolon;
        }

        /* renamed from: getSetTopBoxInput-EK5gGoQ, reason: not valid java name */
        public final long m3780getSetTopBoxInputEK5gGoQ() {
            return Key.SetTopBoxInput;
        }

        /* renamed from: getSetTopBoxPower-EK5gGoQ, reason: not valid java name */
        public final long m3781getSetTopBoxPowerEK5gGoQ() {
            return Key.SetTopBoxPower;
        }

        /* renamed from: getSettings-EK5gGoQ, reason: not valid java name */
        public final long m3782getSettingsEK5gGoQ() {
            return Key.Settings;
        }

        /* renamed from: getSeven-EK5gGoQ, reason: not valid java name */
        public final long m3783getSevenEK5gGoQ() {
            return Key.Seven;
        }

        /* renamed from: getShiftLeft-EK5gGoQ, reason: not valid java name */
        public final long m3784getShiftLeftEK5gGoQ() {
            return Key.ShiftLeft;
        }

        /* renamed from: getShiftRight-EK5gGoQ, reason: not valid java name */
        public final long m3785getShiftRightEK5gGoQ() {
            return Key.ShiftRight;
        }

        /* renamed from: getSix-EK5gGoQ, reason: not valid java name */
        public final long m3786getSixEK5gGoQ() {
            return Key.Six;
        }

        /* renamed from: getSlash-EK5gGoQ, reason: not valid java name */
        public final long m3787getSlashEK5gGoQ() {
            return Key.Slash;
        }

        /* renamed from: getSleep-EK5gGoQ, reason: not valid java name */
        public final long m3788getSleepEK5gGoQ() {
            return Key.Sleep;
        }

        /* renamed from: getSoftLeft-EK5gGoQ, reason: not valid java name */
        public final long m3789getSoftLeftEK5gGoQ() {
            return Key.SoftLeft;
        }

        /* renamed from: getSoftRight-EK5gGoQ, reason: not valid java name */
        public final long m3790getSoftRightEK5gGoQ() {
            return Key.SoftRight;
        }

        /* renamed from: getSoftSleep-EK5gGoQ, reason: not valid java name */
        public final long m3791getSoftSleepEK5gGoQ() {
            return Key.SoftSleep;
        }

        /* renamed from: getSpacebar-EK5gGoQ, reason: not valid java name */
        public final long m3792getSpacebarEK5gGoQ() {
            return Key.Spacebar;
        }

        /* renamed from: getStem1-EK5gGoQ, reason: not valid java name */
        public final long m3793getStem1EK5gGoQ() {
            return Key.Stem1;
        }

        /* renamed from: getStem2-EK5gGoQ, reason: not valid java name */
        public final long m3794getStem2EK5gGoQ() {
            return Key.Stem2;
        }

        /* renamed from: getStem3-EK5gGoQ, reason: not valid java name */
        public final long m3795getStem3EK5gGoQ() {
            return Key.Stem3;
        }

        /* renamed from: getStemPrimary-EK5gGoQ, reason: not valid java name */
        public final long m3796getStemPrimaryEK5gGoQ() {
            return Key.StemPrimary;
        }

        /* renamed from: getSwitchCharset-EK5gGoQ, reason: not valid java name */
        public final long m3797getSwitchCharsetEK5gGoQ() {
            return Key.SwitchCharset;
        }

        /* renamed from: getSymbol-EK5gGoQ, reason: not valid java name */
        public final long m3798getSymbolEK5gGoQ() {
            return Key.Symbol;
        }

        /* renamed from: getSystemNavigationDown-EK5gGoQ, reason: not valid java name */
        public final long m3799getSystemNavigationDownEK5gGoQ() {
            return Key.SystemNavigationDown;
        }

        /* renamed from: getSystemNavigationLeft-EK5gGoQ, reason: not valid java name */
        public final long m3800getSystemNavigationLeftEK5gGoQ() {
            return Key.SystemNavigationLeft;
        }

        /* renamed from: getSystemNavigationRight-EK5gGoQ, reason: not valid java name */
        public final long m3801getSystemNavigationRightEK5gGoQ() {
            return Key.SystemNavigationRight;
        }

        /* renamed from: getSystemNavigationUp-EK5gGoQ, reason: not valid java name */
        public final long m3802getSystemNavigationUpEK5gGoQ() {
            return Key.SystemNavigationUp;
        }

        /* renamed from: getT-EK5gGoQ, reason: not valid java name */
        public final long m3803getTEK5gGoQ() {
            return Key.f14509T;
        }

        /* renamed from: getTab-EK5gGoQ, reason: not valid java name */
        public final long m3804getTabEK5gGoQ() {
            return Key.Tab;
        }

        /* renamed from: getThree-EK5gGoQ, reason: not valid java name */
        public final long m3805getThreeEK5gGoQ() {
            return Key.Three;
        }

        /* renamed from: getThumbsDown-EK5gGoQ, reason: not valid java name */
        public final long m3806getThumbsDownEK5gGoQ() {
            return Key.ThumbsDown;
        }

        /* renamed from: getThumbsUp-EK5gGoQ, reason: not valid java name */
        public final long m3807getThumbsUpEK5gGoQ() {
            return Key.ThumbsUp;
        }

        /* renamed from: getToggle2D3D-EK5gGoQ, reason: not valid java name */
        public final long m3808getToggle2D3DEK5gGoQ() {
            return Key.Toggle2D3D;
        }

        /* renamed from: getTv-EK5gGoQ, reason: not valid java name */
        public final long m3809getTvEK5gGoQ() {
            return Key.Tv;
        }

        /* renamed from: getTvAntennaCable-EK5gGoQ, reason: not valid java name */
        public final long m3810getTvAntennaCableEK5gGoQ() {
            return Key.TvAntennaCable;
        }

        /* renamed from: getTvAudioDescription-EK5gGoQ, reason: not valid java name */
        public final long m3811getTvAudioDescriptionEK5gGoQ() {
            return Key.TvAudioDescription;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeDown-EK5gGoQ, reason: not valid java name */
        public final long m3812getTvAudioDescriptionMixingVolumeDownEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeDown;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeUp-EK5gGoQ, reason: not valid java name */
        public final long m3813getTvAudioDescriptionMixingVolumeUpEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeUp;
        }

        /* renamed from: getTvContentsMenu-EK5gGoQ, reason: not valid java name */
        public final long m3814getTvContentsMenuEK5gGoQ() {
            return Key.TvContentsMenu;
        }

        /* renamed from: getTvDataService-EK5gGoQ, reason: not valid java name */
        public final long m3815getTvDataServiceEK5gGoQ() {
            return Key.TvDataService;
        }

        /* renamed from: getTvInput-EK5gGoQ, reason: not valid java name */
        public final long m3816getTvInputEK5gGoQ() {
            return Key.TvInput;
        }

        /* renamed from: getTvInputComponent1-EK5gGoQ, reason: not valid java name */
        public final long m3817getTvInputComponent1EK5gGoQ() {
            return Key.TvInputComponent1;
        }

        /* renamed from: getTvInputComponent2-EK5gGoQ, reason: not valid java name */
        public final long m3818getTvInputComponent2EK5gGoQ() {
            return Key.TvInputComponent2;
        }

        /* renamed from: getTvInputComposite1-EK5gGoQ, reason: not valid java name */
        public final long m3819getTvInputComposite1EK5gGoQ() {
            return Key.TvInputComposite1;
        }

        /* renamed from: getTvInputComposite2-EK5gGoQ, reason: not valid java name */
        public final long m3820getTvInputComposite2EK5gGoQ() {
            return Key.TvInputComposite2;
        }

        /* renamed from: getTvInputHdmi1-EK5gGoQ, reason: not valid java name */
        public final long m3821getTvInputHdmi1EK5gGoQ() {
            return Key.TvInputHdmi1;
        }

        /* renamed from: getTvInputHdmi2-EK5gGoQ, reason: not valid java name */
        public final long m3822getTvInputHdmi2EK5gGoQ() {
            return Key.TvInputHdmi2;
        }

        /* renamed from: getTvInputHdmi3-EK5gGoQ, reason: not valid java name */
        public final long m3823getTvInputHdmi3EK5gGoQ() {
            return Key.TvInputHdmi3;
        }

        /* renamed from: getTvInputHdmi4-EK5gGoQ, reason: not valid java name */
        public final long m3824getTvInputHdmi4EK5gGoQ() {
            return Key.TvInputHdmi4;
        }

        /* renamed from: getTvInputVga1-EK5gGoQ, reason: not valid java name */
        public final long m3825getTvInputVga1EK5gGoQ() {
            return Key.TvInputVga1;
        }

        /* renamed from: getTvMediaContextMenu-EK5gGoQ, reason: not valid java name */
        public final long m3826getTvMediaContextMenuEK5gGoQ() {
            return Key.TvMediaContextMenu;
        }

        /* renamed from: getTvNetwork-EK5gGoQ, reason: not valid java name */
        public final long m3827getTvNetworkEK5gGoQ() {
            return Key.TvNetwork;
        }

        /* renamed from: getTvNumberEntry-EK5gGoQ, reason: not valid java name */
        public final long m3828getTvNumberEntryEK5gGoQ() {
            return Key.TvNumberEntry;
        }

        /* renamed from: getTvPower-EK5gGoQ, reason: not valid java name */
        public final long m3829getTvPowerEK5gGoQ() {
            return Key.TvPower;
        }

        /* renamed from: getTvRadioService-EK5gGoQ, reason: not valid java name */
        public final long m3830getTvRadioServiceEK5gGoQ() {
            return Key.TvRadioService;
        }

        /* renamed from: getTvSatellite-EK5gGoQ, reason: not valid java name */
        public final long m3831getTvSatelliteEK5gGoQ() {
            return Key.TvSatellite;
        }

        /* renamed from: getTvSatelliteBs-EK5gGoQ, reason: not valid java name */
        public final long m3832getTvSatelliteBsEK5gGoQ() {
            return Key.TvSatelliteBs;
        }

        /* renamed from: getTvSatelliteCs-EK5gGoQ, reason: not valid java name */
        public final long m3833getTvSatelliteCsEK5gGoQ() {
            return Key.TvSatelliteCs;
        }

        /* renamed from: getTvSatelliteService-EK5gGoQ, reason: not valid java name */
        public final long m3834getTvSatelliteServiceEK5gGoQ() {
            return Key.TvSatelliteService;
        }

        /* renamed from: getTvTeletext-EK5gGoQ, reason: not valid java name */
        public final long m3835getTvTeletextEK5gGoQ() {
            return Key.TvTeletext;
        }

        /* renamed from: getTvTerrestrialAnalog-EK5gGoQ, reason: not valid java name */
        public final long m3836getTvTerrestrialAnalogEK5gGoQ() {
            return Key.TvTerrestrialAnalog;
        }

        /* renamed from: getTvTerrestrialDigital-EK5gGoQ, reason: not valid java name */
        public final long m3837getTvTerrestrialDigitalEK5gGoQ() {
            return Key.TvTerrestrialDigital;
        }

        /* renamed from: getTvTimerProgramming-EK5gGoQ, reason: not valid java name */
        public final long m3838getTvTimerProgrammingEK5gGoQ() {
            return Key.TvTimerProgramming;
        }

        /* renamed from: getTvZoomMode-EK5gGoQ, reason: not valid java name */
        public final long m3839getTvZoomModeEK5gGoQ() {
            return Key.TvZoomMode;
        }

        /* renamed from: getTwo-EK5gGoQ, reason: not valid java name */
        public final long m3840getTwoEK5gGoQ() {
            return Key.Two;
        }

        /* renamed from: getU-EK5gGoQ, reason: not valid java name */
        public final long m3841getUEK5gGoQ() {
            return Key.f14510U;
        }

        /* renamed from: getUnknown-EK5gGoQ, reason: not valid java name */
        public final long m3842getUnknownEK5gGoQ() {
            return Key.Unknown;
        }

        /* renamed from: getV-EK5gGoQ, reason: not valid java name */
        public final long m3843getVEK5gGoQ() {
            return Key.f14511V;
        }

        /* renamed from: getVoiceAssist-EK5gGoQ, reason: not valid java name */
        public final long m3844getVoiceAssistEK5gGoQ() {
            return Key.VoiceAssist;
        }

        /* renamed from: getVolumeDown-EK5gGoQ, reason: not valid java name */
        public final long m3845getVolumeDownEK5gGoQ() {
            return Key.VolumeDown;
        }

        /* renamed from: getVolumeMute-EK5gGoQ, reason: not valid java name */
        public final long m3846getVolumeMuteEK5gGoQ() {
            return Key.VolumeMute;
        }

        /* renamed from: getVolumeUp-EK5gGoQ, reason: not valid java name */
        public final long m3847getVolumeUpEK5gGoQ() {
            return Key.VolumeUp;
        }

        /* renamed from: getW-EK5gGoQ, reason: not valid java name */
        public final long m3848getWEK5gGoQ() {
            return Key.f14512W;
        }

        /* renamed from: getWakeUp-EK5gGoQ, reason: not valid java name */
        public final long m3849getWakeUpEK5gGoQ() {
            return Key.WakeUp;
        }

        /* renamed from: getWindow-EK5gGoQ, reason: not valid java name */
        public final long m3850getWindowEK5gGoQ() {
            return Key.Window;
        }

        /* renamed from: getX-EK5gGoQ, reason: not valid java name */
        public final long m3851getXEK5gGoQ() {
            return Key.f14513X;
        }

        /* renamed from: getY-EK5gGoQ, reason: not valid java name */
        public final long m3852getYEK5gGoQ() {
            return Key.f14514Y;
        }

        /* renamed from: getYen-EK5gGoQ, reason: not valid java name */
        public final long m3853getYenEK5gGoQ() {
            return Key.Yen;
        }

        /* renamed from: getZ-EK5gGoQ, reason: not valid java name */
        public final long m3854getZEK5gGoQ() {
            return Key.f14515Z;
        }

        /* renamed from: getZenkakuHankaru-EK5gGoQ, reason: not valid java name */
        public final long m3855getZenkakuHankaruEK5gGoQ() {
            return Key.ZenkakuHankaru;
        }

        /* renamed from: getZero-EK5gGoQ, reason: not valid java name */
        public final long m3856getZeroEK5gGoQ() {
            return Key.Zero;
        }

        /* renamed from: getZoomIn-EK5gGoQ, reason: not valid java name */
        public final long m3857getZoomInEK5gGoQ() {
            return Key.ZoomIn;
        }

        /* renamed from: getZoomOut-EK5gGoQ, reason: not valid java name */
        public final long m3858getZoomOutEK5gGoQ() {
            return Key.ZoomOut;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Key(long j8) {
        this.keyCode = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Key m3565boximpl(long j8) {
        return new Key(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3566constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3567equalsimpl(long j8, Object obj) {
        return (obj instanceof Key) && j8 == ((Key) obj).m3571unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3568equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3569hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3570toStringimpl(long j8) {
        return "Key code: " + j8;
    }

    public boolean equals(Object obj) {
        return m3567equalsimpl(this.keyCode, obj);
    }

    public final long getKeyCode() {
        return this.keyCode;
    }

    public int hashCode() {
        return m3569hashCodeimpl(this.keyCode);
    }

    public String toString() {
        return m3570toStringimpl(this.keyCode);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3571unboximpl() {
        return this.keyCode;
    }
}
