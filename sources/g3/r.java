package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f32219b = new r("Checkbox", 0, "clicked_checkbox_nospm_mobile_v0");

    /* renamed from: c, reason: collision with root package name */
    public static final r f32220c = new r("CheckboxWithPrefilledEmail", 1, "clicked_checkbox_nospm_mobile_v0_0");

    /* renamed from: d, reason: collision with root package name */
    public static final r f32221d = new r("CheckboxWithPrefilledEmailAndPhone", 2, "clicked_checkbox_nospm_mobile_v0_1");

    /* renamed from: e, reason: collision with root package name */
    public static final r f32222e = new r("Implied", 3, "implied_consent_withspm_mobile_v0");

    /* renamed from: f, reason: collision with root package name */
    public static final r f32223f = new r("ImpliedWithPrefilledEmail", 4, "implied_consent_withspm_mobile_v0_0");

    /* renamed from: g, reason: collision with root package name */
    public static final r f32224g = new r("EnteredPhoneNumberClickedSaveToLink", 5, "entered_phone_number_clicked_save_to_link");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f32225h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32226i;

    /* renamed from: a, reason: collision with root package name */
    private final String f32227a;

    static {
        r[] a9 = a();
        f32225h = a9;
        f32226i = W5.b.a(a9);
    }

    private r(String str, int i8, String str2) {
        this.f32227a = str2;
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f32219b, f32220c, f32221d, f32222e, f32223f, f32224g};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f32225h.clone();
    }

    public final String b() {
        return this.f32227a;
    }
}
