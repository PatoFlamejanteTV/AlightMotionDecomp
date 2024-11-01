package com.mbridge.msdk.video.dynview.c;

/* loaded from: classes4.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: g, reason: collision with root package name */
    private int f23283g;

    /* renamed from: h, reason: collision with root package name */
    private String f23284h;

    a(int i8, String str) {
        this.f23283g = i8;
        this.f23284h = str;
    }

    public final int a() {
        return this.f23283g;
    }

    public final String b() {
        return this.f23284h;
    }
}
