package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f19951a;

    /* renamed from: b, reason: collision with root package name */
    private File f19952b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f19953c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f19954d;

    /* renamed from: e, reason: collision with root package name */
    private String f19955e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19956f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19957g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19958h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19959i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19960j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19961k;

    /* renamed from: l, reason: collision with root package name */
    private int f19962l;

    /* renamed from: m, reason: collision with root package name */
    private int f19963m;

    /* renamed from: n, reason: collision with root package name */
    private int f19964n;

    /* renamed from: o, reason: collision with root package name */
    private int f19965o;

    /* renamed from: p, reason: collision with root package name */
    private int f19966p;

    /* renamed from: q, reason: collision with root package name */
    private int f19967q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f19968r;

    /* loaded from: classes4.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f19969a;

        /* renamed from: b, reason: collision with root package name */
        private File f19970b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f19971c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f19972d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19973e;

        /* renamed from: f, reason: collision with root package name */
        private String f19974f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f19975g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19976h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19977i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f19978j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f19979k;

        /* renamed from: l, reason: collision with root package name */
        private int f19980l;

        /* renamed from: m, reason: collision with root package name */
        private int f19981m;

        /* renamed from: n, reason: collision with root package name */
        private int f19982n;

        /* renamed from: o, reason: collision with root package name */
        private int f19983o;

        /* renamed from: p, reason: collision with root package name */
        private int f19984p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f19974f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f19971c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z8) {
            this.f19973e = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i8) {
            this.f19983o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f19972d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f19970b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f19969a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z8) {
            this.f19978j = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z8) {
            this.f19976h = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z8) {
            this.f19979k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z8) {
            this.f19975g = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z8) {
            this.f19977i = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i8) {
            this.f19982n = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i8) {
            this.f19980l = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i8) {
            this.f19981m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i8) {
            this.f19984p = i8;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z8);

        IViewOptionBuilder countDownTime(int i8);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z8);

        IViewOptionBuilder isClickButtonVisible(boolean z8);

        IViewOptionBuilder isLogoVisible(boolean z8);

        IViewOptionBuilder isScreenClick(boolean z8);

        IViewOptionBuilder isShakeVisible(boolean z8);

        IViewOptionBuilder orientation(int i8);

        IViewOptionBuilder shakeStrenght(int i8);

        IViewOptionBuilder shakeTime(int i8);

        IViewOptionBuilder templateType(int i8);
    }

    public DyOption(Builder builder) {
        this.f19951a = builder.f19969a;
        this.f19952b = builder.f19970b;
        this.f19953c = builder.f19971c;
        this.f19954d = builder.f19972d;
        this.f19957g = builder.f19973e;
        this.f19955e = builder.f19974f;
        this.f19956f = builder.f19975g;
        this.f19958h = builder.f19976h;
        this.f19960j = builder.f19978j;
        this.f19959i = builder.f19977i;
        this.f19961k = builder.f19979k;
        this.f19962l = builder.f19980l;
        this.f19963m = builder.f19981m;
        this.f19964n = builder.f19982n;
        this.f19965o = builder.f19983o;
        this.f19967q = builder.f19984p;
    }

    public String getAdChoiceLink() {
        return this.f19955e;
    }

    public CampaignEx getCampaignEx() {
        return this.f19953c;
    }

    public int getCountDownTime() {
        return this.f19965o;
    }

    public int getCurrentCountDown() {
        return this.f19966p;
    }

    public DyAdType getDyAdType() {
        return this.f19954d;
    }

    public File getFile() {
        return this.f19952b;
    }

    public List<String> getFileDirs() {
        return this.f19951a;
    }

    public int getOrientation() {
        return this.f19964n;
    }

    public int getShakeStrenght() {
        return this.f19962l;
    }

    public int getShakeTime() {
        return this.f19963m;
    }

    public int getTemplateType() {
        return this.f19967q;
    }

    public boolean isApkInfoVisible() {
        return this.f19960j;
    }

    public boolean isCanSkip() {
        return this.f19957g;
    }

    public boolean isClickButtonVisible() {
        return this.f19958h;
    }

    public boolean isClickScreen() {
        return this.f19956f;
    }

    public boolean isLogoVisible() {
        return this.f19961k;
    }

    public boolean isShakeVisible() {
        return this.f19959i;
    }

    public void setDyCountDownListener(int i8) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f19968r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i8);
        }
        this.f19966p = i8;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f19968r = dyCountDownListenerWrapper;
    }
}
