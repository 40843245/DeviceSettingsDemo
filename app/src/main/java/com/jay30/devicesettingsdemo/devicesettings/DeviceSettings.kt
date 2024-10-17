package com.jay30.devicesettingsdemo.devicesettings

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.annotation.RequiresApi

/**
Activity Action: Show settings for accessibility modules.
 */
fun openAccessibilitySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show add account screen for creating a new account.
 */
fun openAddAccountSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_ADD_ACCOUNT).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of Advanced memory protection.
 */
@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
fun openAdvancedMemoryProtectionSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_ADVANCED_MEMORY_PROTECTION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow entering/exiting airplane mode.
 */
fun openAirplaneModeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show app listing settings, filtered by those that send notifications.
 */
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
fun openAllAppsNotificationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_ALL_APPS_NOTIFICATION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of APNs.
 */
fun openAPNSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APN_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen of details about a particular application.
 */
fun openApplicationDetailsSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of application development-related settings.
 */
fun openApplicationDevelopmentSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of application-related settings.
 */
fun openApplicationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APPLICATION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}


/**
Activity Action: Show notification bubble settings for a single app.
 */
@RequiresApi(Build.VERSION_CODES.Q)
fun openAppNotificationBubbleSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}


/**
Activity Action: Show notification settings for a single app.
 */
@RequiresApi(Build.VERSION_CODES.O)

fun openAppNotificationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show the "Open by Default" page in a particular application's details page.
*/
@RequiresApi(Build.VERSION_CODES.S)
fun openAppOpenByDefaultSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APP_OPEN_BY_DEFAULT_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity action: Show Settings app search UI when this action is available for device.
*/
@RequiresApi(Build.VERSION_CODES.S)
fun openAppSearchSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APP_SEARCH_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling app usage properties for an app.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun openAppUsageSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_APP_USAGE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Shows the settings page for an `[AutomaticZenRule](https://developer.android.com/reference/android/app/AutomaticZenRule)` mode.
 */
@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun openAutomaticZenRuleSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_AUTOMATIC_ZEN_RULE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Auto Rotate configuration settings.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun openAutoRotateSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_AUTO_ROTATE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show battery saver settings.
 */
fun openBatterySaverSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of Bluetooth.
 */
fun openBluetoothSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of cast endpoints.
 */
fun openCastSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_CAST_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show notification settings for a single `[NotificationChannel](https://developer.android.com/reference/android/app/NotificationChannel)`.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun openChannelNotificationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show the automatic do not disturb rule listing page

Users can add, enable, disable, and remove automatic do not disturb rules from this screen.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openConditionProviderSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_CONDITION_PROVIDER_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen that let user enable a Credential Manager provider.
 */
@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun openCredentialSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_CREDENTIAL_PROVIDER).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings for selection of 2G/3G.
 */
fun openDataRoamingSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_DATA_ROAMING_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of data and view data usage.
 */
@RequiresApi(Build.VERSION_CODES.P)
fun openDataUsageSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_DATA_USAGE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of date and time.
 */
fun openDateSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_DATE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of display.
 */
fun openDisplaySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_DISPLAY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Daydream settings.
 */
fun openDreamSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_DREAM_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to configure the hardware keyboard.
 */
fun openHardKeyboardSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_HARD_KEYBOARD_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Home selection settings.
 */
fun openHomeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_HOME_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling background data restrictions for a particular application.
 */
fun openIgnoreBackgroundDataRestrictionSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling which apps can ignore battery optimizations.
 */
fun openIgnoreBatteryOptimizationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to configure input methods, in particular allowing the user to enable input methods.
 */
fun openInputMethodSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_INPUT_METHOD_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to enable/disable input method subtypes.
 */
fun openInputMethodSubTypeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings for internal storage.
 */
fun openInternalStorageSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of locale.
 */
fun openLocalSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_LOCALE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of current location sources.
 */
fun openLocationSourceSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to manage all applications
 */
fun openManageAllApplicationsSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to manage all SIM profiles.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun openManageAllSimProfilesSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_ALL_SIM_PROFILES_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to manage installed applications.
 */
fun openManageApplicationsSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling if the app specified in the data URI of the intent can manage external storage.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openManageAppAllFilesAccessPermissionSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling if the app specified in the data URI of the intent can manage external storage.
 */
@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
fun openManageAppUseFullScreenIntentSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_APP_USE_FULL_SCREEN_INTENT).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Default apps settings.
 */
fun openManageDefaultAppsSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling which apps can draw on top of other apps.
 */
fun openManageOverlaySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity action: Launch UI to manage a setting restricted by supervisors.
 */
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
fun openManageSupervisorRestrictedSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_SUPERVISOR_RESTRICTED_SETTING).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of trusted external sources
Input: Optionally, the Intent's data URI can specify the application package name to directly invoke the management GUI specific to the package name.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun openManageUnknownAppSourceSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling which apps are allowed to write/modify system settings.
 */
fun openManageWriteSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings for memory card storage
 */
fun openMemoryCardSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_MEMORY_CARD_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show NFC Sharing settings.
 */
fun openNFCSharingSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NFCSHARING_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show NFC Tap & Pay settings

This shows UI that allows the user to configure Tap&Pay settings.
 */
fun openNFCPaymentSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NFC_PAYMENT_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show NFC settings.
 */
fun openNFCSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NFC_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of Night display.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun openNightDisplaySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NIGHT_DISPLAY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Notification assistant settings.
 */
@RequiresApi(Build.VERSION_CODES.Q)
fun openNotificationAssistantSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NOTIFICATION_ASSISTANT_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show notification listener permission settings page for app.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openNotificationListenerDetailSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_DETAIL_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Notification listener settings.
 */
fun openNotificationListenerSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Do Not Disturb access settings.
 */
fun openNotificationPolicyAccessSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of privacy options, i.e.
 */
fun openPrivacySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_PRIVACY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show setting page to process a Wi-Fi Easy Connect (aka DPP) URI and start configuration.
 */
@RequiresApi(Build.VERSION_CODES.Q)
fun openProcessWifiEasyConnectUriSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_PROCESS_WIFI_EASY_CONNECT_URI).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen for controlling the Quick Access Wallet.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openQuickAccessWalletSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_QUICK_ACCESS_WALLET_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of quick launch shortcuts.
 */
fun openQuickLaunchSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_QUICK_LAUNCH_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of regional preferences

Input: Nothing

Output: Nothing.
 */
@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
fun openRegionalPreferencesSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REGIONAL_PREFERENCES_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Ask the user to allow an app to ignore battery optimizations (that is, put them on the allowlist of apps shown by `[ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS](https://developer.android.com/reference/android/provider/Settings#ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)`).
 */
@SuppressLint("BatteryLife")
fun openRequestIgnoreBatteryOptimizationSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of `[Manifest.permission#MANAGE_MEDIA](https://developer.android.com/reference/android/Manifest.permission#MANAGE_MEDIA)` permission Input: Optionally, the Intent's data URI can specify the application package name to directly invoke the management GUI specific to the package name.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun openRequestManageMediaSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REQUEST_MANAGE_MEDIA).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of `[Manifest.permission#MEDIA_ROUTING_CONTROL](https://developer.android.com/reference/android/Manifest.permission#MEDIA_ROUTING_CONTROL)` permission.
 */
@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun openRequestManageMediaRoutingSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REQUEST_MEDIA_ROUTING_CONTROL).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of `[Manifest.permission#SCHEDULE_EXACT_ALARM](https://developer.android.com/reference/android/Manifest.permission#SCHEDULE_EXACT_ALARM)` permission Input: Optionally, the Intent's data URI can specify the application package name to directly invoke the management GUI specific to the package name.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun openRequestScheduleExactAlarmSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show screen that let user select its Autofill Service.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun openRequestSetAutoFillSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_REQUEST_SET_AUTOFILL_SERVICE).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to provide guide about carrier satellite messaging.
 */
@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun openSatelliteSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SATELLITE_SETTING).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings for global search.
 */
fun openSearchSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SEARCH_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of security and location privacy.
 */
fun openSecuritySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SECURITY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show system settings.
 */
fun openSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: For system or preinstalled apps to show their `[Activity](https://developer.android.com/reference/android/app/Activity)` embedded in Settings app on large screen devices.
 */
@RequiresApi(Build.VERSION_CODES.S_V2)
fun openSettingsEmbedDeepLinkActivitySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SETTINGS_EMBED_DEEP_LINK_ACTIVITY).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show the regulatory information screen for the device.
 */
fun openShowRegulatoryInfoSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SHOW_REGULATORY_INFO).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Work Policy info.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openShowWorkPolicySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SHOW_WORK_POLICY_INFO).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of sound and volume.
 */
fun openSoundSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SOUND_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
 * > [!NOTICE]
 * > _This constant was deprecated in API level 29._
 * >
 * > use `[ACTION_APPLICATION_DETAILS_SETTINGS](https://developer.android.com/reference/android/provider/Settings#ACTION_APPLICATION_DETAILS_SETTINGS)` to manage storage permissions for a specific application. _
 */
@RequiresApi(Build.VERSION_CODES.P)
fun openStorageVolumeAccessSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_STORAGE_VOLUME_ACCESS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of sync settings.
 */
fun openSyncSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_SYNC_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to control access to usage information.
 */
fun openUsageAccessSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to manage the user input dictionary.
 */
fun openUserDictionarySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_USER_DICTIONARY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Modify Airplane mode settings using a voice command.
 */
fun openVoiceControlAirplaneModeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_VOICE_CONTROL_AIRPLANE_MODE).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Modify Battery Saver mode setting using a voice command.
 */
fun openVoiceControlBatterySaverModeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Modify do not disturb mode settings.
 */
fun modifyDoNotDisturbModeSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to configure input methods, in particular allowing the user to enable input methods.
 */
fun openVoiceInputSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_VOICE_INPUT_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of VPN.
 */
fun openVPNSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_VPN_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show VR listener settings.
 */
fun allowUserToSelectCurrentWebViewImplementation(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_WEBVIEW_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Allows user to select current webview implementation.
 */
@RequiresApi(Build.VERSION_CODES.R)
fun openWifiAddNetworksSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_WIFI_ADD_NETWORKS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show setting page to process the addition of Wi-Fi networks to the user's saved network list.
 */
fun openWifiIPSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_WIFI_IP_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of a static IP address for Wi-Fi.
 */
fun openWifiSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_WIFI_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks.
 */
fun openWirelessSettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_WIRELESS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}

/**
Activity Action: Show Zen Mode (aka Do Not Disturb) priority configuration settings.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun openZenModePrioritySettings(packageName: String, context: Context) {
    val intent = Intent(Settings.ACTION_ZEN_MODE_PRIORITY_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    context.startActivity(intent)
}