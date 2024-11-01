package androidx.room;

import Q5.I;
import a6.AbstractC1677b;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i8, SupportSQLiteOpenHelper delegate) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i8;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File file, boolean z8) throws IOException {
        ReadableByteChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            AbstractC3292y.h(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
            AbstractC3292y.h(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                    AbstractC3292y.h(newChannel, "newChannel(inputStream)");
                } catch (Exception e8) {
                    throw new IOException("inputStreamCallable exception on call", e8);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        AbstractC3292y.h(output, "output");
        FileUtil.copy(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC3292y.h(intermediateFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(intermediateFile, z8);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        try {
            final int readVersion = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder name = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            final int d8 = i6.m.d(readVersion, 1);
            return frameworkSQLiteOpenHelperFactory.create(name.callback(new SupportSQLiteOpenHelper.Callback(d8) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase db) {
                    AbstractC3292y.i(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase db) {
                    AbstractC3292y.i(db, "db");
                    int i8 = readVersion;
                    if (i8 < 1) {
                        db.setVersion(i8);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase db, int i8, int i9) {
                    AbstractC3292y.i(db, "db");
                }
            }).build());
        } catch (IOException e8) {
            throw new RuntimeException("Malformed database file, unable to read version.", e8);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z8) {
        SupportSQLiteDatabase readableDatabase;
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            AbstractC3292y.y("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            if (z8) {
                readableDatabase = createFrameworkOpenHelper.getWritableDatabase();
            } else {
                readableDatabase = createFrameworkOpenHelper.getReadableDatabase();
            }
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                AbstractC3292y.y("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            AbstractC3292y.f(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(readableDatabase);
            I i8 = I.f8786a;
            AbstractC1677b.a(createFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z8) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databaseFile = this.context.getDatabasePath(databaseName);
            DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
            DatabaseConfiguration databaseConfiguration2 = null;
            if (databaseConfiguration == null) {
                AbstractC3292y.y("databaseConfiguration");
                databaseConfiguration = null;
            }
            boolean z9 = databaseConfiguration.multiInstanceInvalidation;
            File filesDir = this.context.getFilesDir();
            AbstractC3292y.h(filesDir, "context.filesDir");
            ProcessLock processLock = new ProcessLock(databaseName, filesDir, z9);
            try {
                ProcessLock.lock$default(processLock, false, 1, null);
                if (!databaseFile.exists()) {
                    try {
                        AbstractC3292y.h(databaseFile, "databaseFile");
                        copyDatabaseFile(databaseFile, z8);
                        processLock.unlock();
                        return;
                    } catch (IOException e8) {
                        throw new RuntimeException("Unable to copy database file.", e8);
                    }
                }
                try {
                    AbstractC3292y.h(databaseFile, "databaseFile");
                    int readVersion = DBUtil.readVersion(databaseFile);
                    if (readVersion == this.databaseVersion) {
                        processLock.unlock();
                        return;
                    }
                    DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                    if (databaseConfiguration3 == null) {
                        AbstractC3292y.y("databaseConfiguration");
                    } else {
                        databaseConfiguration2 = databaseConfiguration3;
                    }
                    if (databaseConfiguration2.isMigrationRequired(readVersion, this.databaseVersion)) {
                        processLock.unlock();
                        return;
                    }
                    if (this.context.deleteDatabase(databaseName)) {
                        try {
                            copyDatabaseFile(databaseFile, z8);
                        } catch (IOException e9) {
                            Log.w(Room.LOG_TAG, "Unable to copy database file.", e9);
                        }
                    } else {
                        Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    processLock.unlock();
                    return;
                } catch (IOException e10) {
                    Log.w(Room.LOG_TAG, "Unable to read database version.", e10);
                    processLock.unlock();
                    return;
                }
            } catch (Throwable th) {
                processLock.unlock();
                throw th;
            }
            processLock.unlock();
            throw th;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        AbstractC3292y.i(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z8) {
        getDelegate().setWriteAheadLoggingEnabled(z8);
    }
}
