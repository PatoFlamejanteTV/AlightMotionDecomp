package com.mbridge.msdk.foundation.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    private static h f20444a;

    private h(Context context) {
        super(context);
    }

    public static synchronized h a(Context context) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f20444a == null) {
                    f20444a = new h(context.getApplicationContext());
                }
                hVar = f20444a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'reporterror'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'reward_report'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'download_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'batch_report'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'bid_replace_campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'CacheCampaign'");
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonSDKDBHelper", e8.getLocalizedMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.db.g
    protected final int b() {
        return 83;
    }

    @Override // com.mbridge.msdk.foundation.db.g
    protected final void b(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        if (com.mbridge.msdk.f.d.a(sQLiteDatabase)) {
            c(sQLiteDatabase);
            b(sQLiteDatabase);
        }
    }

    @Override // com.mbridge.msdk.foundation.db.g
    protected final String a() {
        return "mbridge.msdk.db";
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,deeplink_url TEXT,user_activation TEXT,only_impression TEXT,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,fc_b INTEGER,ad_call TEXT,ad_url_list TEXT,video_url TEXT,video_size INTEGER,video_resolution TEXT,watch_mile INTEGER,video_length INTEGER,ts INTEGER,bty INTEGER,advImp TEXT,t_imp INTEGER,guidelines TEXT,offer_type INTEGER,html_url TEXT,end_screen_url TEXT,reward_amount INTEGER,reward_play_status INTEGER,retarget INTEGER,video_end_type INTEGER,playable_ads_without_video INTEGER,endcard_url TEXT,nv_t2 INTEGER,gif_url TEXT,reward_name TEXT,reward_teamplate TEXT,md5_file TEXT,jm_pd INTEGER,is_deleted INTEGER,is_click INTEGER,is_add_sucesful INTEGER,short_ctime TEXT,native_ad_tracking TEXT,c_coi INTEGER,c_ua INTEGER,ia_icon TEXT,ia_rst INTEGER,ia_url TEXT,ia_ori INTEGER,ad_type INTEGER,ia_ext1 TEXT,ia_ext2 TEXT,ia_cache TEXT,is_download_zip INTEGER,oc_time INTEGER,oc_type INTEGER,t_list TEXT,adchoice TEXT,adchoice_size_height INTEGER,adchoice_size_width INTEGER,imp_ua INTEGER,endcard_click_result INTEGER,plct INTEGER,plctb INTEGER,c_c_time INTEGER,is_bid_campaign INTEGER,bid_token TEXT,mraid TEXT,is_mraid_campaign INTEGER,omid TEXT,banner_url TEXT,banner_html TEXT,mof_tplid INTEGER,ready_rate INTEGER,ext_data TEXT,nscpt INTEGER,mof_template_url TEXT,req_ext_data TEXT,wtick INTEGER,creative_id INTEGER,vid_crtv_id INTEGER,ec_crtv_id INTEGER,ec_temp_id INTEGER,readyState INTEGER,pv_urls TEXT,ad_zip TEXT,ad_html TEXT,gh_id TEXT,gh_path TEXT,bind_id TEXT,load_timeout INTEGER,request_id TEXT,n_request_id TEXT,local_request_id TEXT,n_local_request_id TEXT,err_type_default_ad INTEGER,err_reason_default_ad TEXT,placement_id TEXT,number_rating INTEGER,maitve INTEGER,flb INTEGER,flb_skiptime INTEGER,adspace_t INTEGER,vst INTEGER,use_skip_time INTEGER,prog_bar INTEGER,cbd INTEGER,maitve_src TEXT,vcn INTEGER,token_r INTEGER,encrypt_p TEXT,aab TEXT,vck_t INTEGER,vctn_t INTEGER,view_com_time INTEGER,fac INTEGER,tp_offer INTEGER,rs_ignc_r TEXT,imp_report_type INTEGER,privacy_url TEXT,privacy_button_video INTEGER,auto_minicard INTEGER,mincard_trigger_time INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report_campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,wtick INTEGER,only_impression TEXT,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,video_url TEXT,video_size INTEGER,video_resolution TEXT,watch_mile INTEGER,video_length INTEGER,ts INTEGER,bty INTEGER,advImp TEXT,t_imp INTEGER,guidelines TEXT,offer_type INTEGER,html_url TEXT,end_screen_url TEXT,reward_amount INTEGER,reward_play_status INTEGER,retarget INTEGER,video_end_type INTEGER,playable_ads_without_video INTEGER,endcard_url TEXT,nv_t2 INTEGER,gif_url TEXT,reward_name TEXT,reward_teamplate TEXT,md5_file TEXT,native_ad_tracking TEXT,c_coi INTEGER,c_ua INTEGER,imp_ua INTEGER,endcard_click_result INTEGER,number_rating INTEGER,flb INTEGER,adspace_t INTEGER,vst INTEGER,use_skip_time INTEGER,prog_bar INTEGER,cbd INTEGER,view_com_time INTEGER,flb_skiptime INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS frequence (id TEXT,fc_a INTEGER,fc_b INTEGER,impression_count INTEGER,click_count INTEGER,ts INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS campaignclick (id TEXT,unitid TEXT,result TEXT,ts INTEGER,pts INTEGER,cpei INTEGER,cpoci INTEGER,package_name TEXT,n4 INTEGER,cps INTEGER,cti INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS reporterror (id integer primary key autoincrement,url TEXT,method TEXT,time_stamp INTEGER,data TEXT,count INTEGER,unitId TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS click_time(id integer primary key autoincrement,campaignId TEXT,click_type INTEGER,click_duration TEXT,last_url TEXT,code INTEGER,exception TEXT,header TEXT,content TEXT,network_type INTEGER,network_str TEXT,rid TEXT,rid_n TEXT,unit_id TEXT,landing_type INTEGER,link_type INTEGER,click_time TEXT,market_result INTEGER,type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS load_stat (id integer primary key autoincrement,time TEXT,ad_source_id integer,adNum integer,unitId TEXT,fb integer,hb integer,timeout integer,network_type_str TEXT,network_type integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,only_impression TEXT,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,ad_bid_token TEXT,video_url TEXT,pregeress_size INTEGER,total_size INTEGER,video_download_start INTEGER,video_state INTEGER,video_path TEXT,endcard_click_result INTEGER,ts INTEGER  )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS reward_report (id integer primary key autoincrement,key TEXT,networkType INTEGER,network_str TEXT,isCompleteView INTEGER,watchedMillis INTEGER,videoLength INTEGER,image_url TEXT,template_url TEXT,rid TEXT,rid_n TEXT,video_url TEXT,offerUrl TEXT,reason TEXT,result INTEGER,duration TEXT,ad_type TEXT,type TEXT,h5_click_data TEXT,endcard_url TEXT,unitId TEXT,campaignId TEXT,resource_type TEXT,device_id TEXT,creative TEXT,videoSize INTEGER,endcard_click_result INTEGER,adspace_t INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS fq_info (id TEXT,unitId TEXT,time INTEGER,type INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dailyplaycap (unit_id TEXT,play_time INTEGER,first_insert_timestamp INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS display_resource_type (id integer primary key autoincrement,campaign_id TEXT,is_click INTEGER,click_time INTEGER,resource_type INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS unit_id (placement_id TEXT,unitId TEXT,ad_type integer)");
            sQLiteDatabase.execSQL(DownloadModel.CREATE_TABLE);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS batch_report (report_message TEXT,time INTEGER,report_state INTEGER,type INTEGER,uuid TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c_replace_temp (d_key TEXT,d_value TEXT,time INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bid_replace_campaign (bid_unit_id TEXT,expect_bid_token TEXT,expect_encrypt_price TEXT,real_request_id TEXT ,real_encrypt_price TEXT,real_token_rule INTEGER,is_replace INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS CacheCampaign (id TEXT,unitid TEXT,ts INTEGER,rid TEXT,lrid TEXT,campaigns TEXT,ecppv TEXT,show_count INTEGER,interval_ts INTEGER,show_time INTEGER,state INTEGER )");
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonSDKDBHelper", e8.getLocalizedMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.db.g
    protected final void a(SQLiteDatabase sQLiteDatabase) {
        if (com.mbridge.msdk.f.d.a(sQLiteDatabase)) {
            b(sQLiteDatabase);
        }
    }

    @Override // com.mbridge.msdk.foundation.db.g
    protected final void a(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        if (com.mbridge.msdk.f.d.a(sQLiteDatabase)) {
            c(sQLiteDatabase);
            b(sQLiteDatabase);
        }
    }
}
