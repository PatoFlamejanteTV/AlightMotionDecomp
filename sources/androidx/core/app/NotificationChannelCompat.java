package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* loaded from: classes.dex */
public class NotificationChannelCompat {
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    String mConversationId;
    String mDescription;
    String mGroupId;

    @NonNull
    final String mId;
    int mImportance;
    private boolean mImportantConversation;
    int mLightColor;
    boolean mLights;
    private int mLockscreenVisibility;
    CharSequence mName;
    String mParentId;
    boolean mShowBadge;
    Uri mSound;
    boolean mVibrationEnabled;
    long[] mVibrationPattern;

    @RequiresApi(26)
    /* loaded from: classes.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static boolean canBypassDnd(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @DoNotInline
        static boolean canShowBadge(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @DoNotInline
        static NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i8) {
            return new NotificationChannel(str, charSequence, i8);
        }

        @DoNotInline
        static void enableLights(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.enableLights(z8);
        }

        @DoNotInline
        static void enableVibration(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.enableVibration(z8);
        }

        @DoNotInline
        static AudioAttributes getAudioAttributes(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @DoNotInline
        static String getDescription(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @DoNotInline
        static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        static int getImportance(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @DoNotInline
        static int getLightColor(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @DoNotInline
        static int getLockscreenVisibility(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @DoNotInline
        static CharSequence getName(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @DoNotInline
        static Uri getSound(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @DoNotInline
        static long[] getVibrationPattern(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @DoNotInline
        static void setDescription(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @DoNotInline
        static void setGroup(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @DoNotInline
        static void setLightColor(NotificationChannel notificationChannel, int i8) {
            notificationChannel.setLightColor(i8);
        }

        @DoNotInline
        static void setShowBadge(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.setShowBadge(z8);
        }

        @DoNotInline
        static void setSound(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @DoNotInline
        static void setVibrationPattern(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @DoNotInline
        static boolean shouldShowLights(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @DoNotInline
        static boolean shouldVibrate(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static boolean canBubble(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    @RequiresApi(30)
    /* loaded from: classes.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static String getConversationId(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @DoNotInline
        static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @DoNotInline
        static boolean isImportantConversation(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @DoNotInline
        static void setConversationId(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private final NotificationChannelCompat mChannel;

        public Builder(@NonNull String str, int i8) {
            this.mChannel = new NotificationChannelCompat(str, i8);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.mChannel;
        }

        @NonNull
        public Builder setConversationId(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.mChannel;
                notificationChannelCompat.mParentId = str;
                notificationChannelCompat.mConversationId = str2;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mChannel.mDescription = str;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mChannel.mGroupId = str;
            return this;
        }

        @NonNull
        public Builder setImportance(int i8) {
            this.mChannel.mImportance = i8;
            return this;
        }

        @NonNull
        public Builder setLightColor(int i8) {
            this.mChannel.mLightColor = i8;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z8) {
            this.mChannel.mLights = z8;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mChannel.mName = charSequence;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z8) {
            this.mChannel.mShowBadge = z8;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.mSound = uri;
            notificationChannelCompat.mAudioAttributes = audioAttributes;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z8) {
            this.mChannel.mVibrationEnabled = z8;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] jArr) {
            boolean z8;
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            if (jArr != null && jArr.length > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            notificationChannelCompat.mVibrationEnabled = z8;
            notificationChannelCompat.mVibrationPattern = jArr;
            return this;
        }
    }

    NotificationChannelCompat(@NonNull String str, int i8) {
        this.mShowBadge = true;
        this.mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        this.mId = (String) Preconditions.checkNotNull(str);
        this.mImportance = i8;
        this.mAudioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean canBubble() {
        return this.mCanBubble;
    }

    public boolean canBypassDnd() {
        return this.mBypassDnd;
    }

    public boolean canShowBadge() {
        return this.mShowBadge;
    }

    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.mAudioAttributes;
    }

    @Nullable
    public String getConversationId() {
        return this.mConversationId;
    }

    @Nullable
    public String getDescription() {
        return this.mDescription;
    }

    @Nullable
    public String getGroup() {
        return this.mGroupId;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public int getLightColor() {
        return this.mLightColor;
    }

    public int getLockscreenVisibility() {
        return this.mLockscreenVisibility;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationChannel getNotificationChannel() {
        String str;
        String str2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            return null;
        }
        NotificationChannel createNotificationChannel = Api26Impl.createNotificationChannel(this.mId, this.mName, this.mImportance);
        Api26Impl.setDescription(createNotificationChannel, this.mDescription);
        Api26Impl.setGroup(createNotificationChannel, this.mGroupId);
        Api26Impl.setShowBadge(createNotificationChannel, this.mShowBadge);
        Api26Impl.setSound(createNotificationChannel, this.mSound, this.mAudioAttributes);
        Api26Impl.enableLights(createNotificationChannel, this.mLights);
        Api26Impl.setLightColor(createNotificationChannel, this.mLightColor);
        Api26Impl.setVibrationPattern(createNotificationChannel, this.mVibrationPattern);
        Api26Impl.enableVibration(createNotificationChannel, this.mVibrationEnabled);
        if (i8 >= 30 && (str = this.mParentId) != null && (str2 = this.mConversationId) != null) {
            Api30Impl.setConversationId(createNotificationChannel, str, str2);
        }
        return createNotificationChannel;
    }

    @Nullable
    public String getParentChannelId() {
        return this.mParentId;
    }

    @Nullable
    public Uri getSound() {
        return this.mSound;
    }

    @Nullable
    public long[] getVibrationPattern() {
        return this.mVibrationPattern;
    }

    public boolean isImportantConversation() {
        return this.mImportantConversation;
    }

    public boolean shouldShowLights() {
        return this.mLights;
    }

    public boolean shouldVibrate() {
        return this.mVibrationEnabled;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    public NotificationChannelCompat(@NonNull NotificationChannel notificationChannel) {
        this(Api26Impl.getId(notificationChannel), Api26Impl.getImportance(notificationChannel));
        this.mName = Api26Impl.getName(notificationChannel);
        this.mDescription = Api26Impl.getDescription(notificationChannel);
        this.mGroupId = Api26Impl.getGroup(notificationChannel);
        this.mShowBadge = Api26Impl.canShowBadge(notificationChannel);
        this.mSound = Api26Impl.getSound(notificationChannel);
        this.mAudioAttributes = Api26Impl.getAudioAttributes(notificationChannel);
        this.mLights = Api26Impl.shouldShowLights(notificationChannel);
        this.mLightColor = Api26Impl.getLightColor(notificationChannel);
        this.mVibrationEnabled = Api26Impl.shouldVibrate(notificationChannel);
        this.mVibrationPattern = Api26Impl.getVibrationPattern(notificationChannel);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.mParentId = Api30Impl.getParentChannelId(notificationChannel);
            this.mConversationId = Api30Impl.getConversationId(notificationChannel);
        }
        this.mBypassDnd = Api26Impl.canBypassDnd(notificationChannel);
        this.mLockscreenVisibility = Api26Impl.getLockscreenVisibility(notificationChannel);
        if (i8 >= 29) {
            this.mCanBubble = Api29Impl.canBubble(notificationChannel);
        }
        if (i8 >= 30) {
            this.mImportantConversation = Api30Impl.isImportantConversation(notificationChannel);
        }
    }
}
