package com.jay30.devicesettingsdemo

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jay30.devicesettingsdemo.devicesettings.*

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun MainScreen(){
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .horizontalScroll(rememberScrollState()),
        ) {

            Button(onClick = {
                openAccessibilitySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_accessibility_settings))
            }

            Button(onClick = {
                openAddAccountSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_add_account_settings))
            }

            Button(onClick = {
                openAdvancedMemoryProtectionSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_advanced_memory_protection_settings))
            }

            Button(onClick = {
                openAirplaneModeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_airplane_mode_settings))
            }

            Button(onClick = {
                openAppNotificationBubbleSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_notification_bubble_settings))
            }

            Button(onClick = {
                openAllAppsNotificationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_all_apps_notification_settings))
            }

            Button(onClick = {
                openAppOpenByDefaultSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_open_by_default_settings))
            }

            Button(onClick = {
                openAPNSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_apn_settings))
            }

            Button(onClick = {
                openApplicationDetailsSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_details_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openApplicationDevelopmentSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_developement_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openApplicationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAppUsageSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_usage_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAutomaticZenRuleSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_automatic_zen_rule_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAppSearchSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_search_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAppNotificationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_notification_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAppNotificationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_app_notification_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openAutoRotateSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_auto_rotate_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openBatterySaverSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_battery_saver_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openBluetoothSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_bluetooth_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openCastSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_cast_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openChannelNotificationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_channel_notification_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openConditionProviderSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_condition_provider_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openCredentialSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_crendential_settings))
            }


            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openDataRoamingSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_data_roaming_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openDataUsageSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_data_usage_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openDateSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_date_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openDisplaySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_display_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openDreamSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_dream_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openHardKeyboardSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_hard_keyboard_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openHomeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_home_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openIgnoreBackgroundDataRestrictionSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_ignore_background_data_restriction_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openIgnoreBatteryOptimizationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_ignore_battery_optimization_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openInputMethodSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_input_method_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openInputMethodSubTypeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_input_method_subtype_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openInternalStorageSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_internal_storage_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openLocalSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_local_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openLocationSourceSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_location_source_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageAllApplicationsSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_all_applications_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageAllSimProfilesSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_all_sim_profiles_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageApplicationsSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_applications_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageAppAllFilesAccessPermissionSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_app_all_files_access_permission_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageAppUseFullScreenIntentSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_App_use_full_screen_intent_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageDefaultAppsSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_default_apps_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageOverlaySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_overlay_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageSupervisorRestrictedSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_supervisor_restricted_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageUnknownAppSourceSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_unknown_app_source_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openManageWriteSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_manage_write_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openMemoryCardSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_memory_card_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNFCSharingSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_nfc_sharing_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNFCPaymentSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_nfc_payment_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNFCSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_nfc_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNightDisplaySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_night_display_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNotificationAssistantSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_notification_assistant_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNotificationListenerDetailSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_notification_listener_detail_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNotificationListenerSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_notification_listener_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openNotificationPolicyAccessSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_notification_policy_access_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openPrivacySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_privacy_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openProcessWifiEasyConnectUriSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_process_wifi_easy_connect_uri_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openQuickAccessWalletSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_quick_access_wallet_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openQuickLaunchSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_quick_launch_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRegionalPreferencesSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_regional_preferences_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRequestIgnoreBatteryOptimizationSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_request_ignore_battery_optimization_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRequestManageMediaSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_request_manage_media_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRequestManageMediaRoutingSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_request_manage_media_routing_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRequestScheduleExactAlarmSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_request_schedule_exact_alarm_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openRequestSetAutoFillSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_request_set_auto_fill_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSatelliteSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_satellite_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSearchSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_search_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSecuritySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_security_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSettingsEmbedDeepLinkActivitySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_settings_embed_deep_link_activity_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openShowRegulatoryInfoSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_show_regulatory_info_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openShowWorkPolicySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_show_work_policy_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSoundSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_sound_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openStorageVolumeAccessSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_storage_volume_access_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openSyncSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_sync_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openUsageAccessSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_usage_access_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openUserDictionarySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_user_dictionary_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openVoiceControlAirplaneModeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_voice_control_airplane_mode_settings))
            }

            Button(onClick = {
                openVoiceControlBatterySaverModeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_voice_control_battery_saver_mode_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                modifyDoNotDisturbModeSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.modify_do_not_disturb_mode_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openVoiceInputSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_voice_input_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openVPNSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_vpn_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                allowUserToSelectCurrentWebViewImplementation(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.allow_user_to_select_current_web_view_implementation))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openWifiAddNetworksSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_wifi_add_networks_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openWifiIPSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_wifi_ip_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openWifiSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_wifi_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openWirelessSettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_wireless_settings))
            }

            Spacer(modifier = Modifier.height(15.dp).fillMaxWidth())
            Button(onClick = {
                openZenModePrioritySettings(context.packageName, context)
            }) {
                Text(stringResource(id = R.string.open_zen_mode_priority_settings))
            }
        }
    }
}