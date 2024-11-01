package com.mbridge.msdk.dycreator.b;

/* loaded from: classes4.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* renamed from: i, reason: collision with root package name */
    private int f19555i;

    /* renamed from: j, reason: collision with root package name */
    private String f19556j;

    b(int i8, String str) {
        this.f19555i = i8;
        this.f19556j = str;
    }

    public final int a() {
        return this.f19555i;
    }

    public final String b() {
        return this.f19556j;
    }
}
