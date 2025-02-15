/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.derpfest.providers;

import android.provider.Settings;
import android.util.Log;


/**
 * DerpFestSettings contains DerpFest specific preferences in System, Secure, and Global.
 */
public final class DerpFestSettings {
    private static final String TAG = "DerpFestSettings";

    /**
     * System settings, containing miscellaneous DerpFest system preferences. This table holds simple
     * name/value pairs. There are convenience functions for accessing individual settings entries.
     */
    public static final class System extends Settings.NameValueTable {
        // region System Settings

        /**
         * Whether the phone ringtone should be played in an increasing manner
         * @hide
         */
        public static final String INCREASING_RING = "increasing_ring";

        /**
         * Start volume fraction for increasing ring volume
         * @hide
         */
        public static final String INCREASING_RING_START_VOLUME = "increasing_ring_start_vol";

        /**
         * Ramp up time (seconds) for increasing ring
         * @hide
         */
        public static final String INCREASING_RING_RAMP_UP_TIME = "increasing_ring_ramp_up_time";

        /**
         * Whether the phone vibrates on call connect
         * @hide
         */
        public static final String VIBRATE_ON_CONNECT = "vibrate_on_connect";

        /**
         * Whether the phone vibrates on call waiting
         * @hide
         */
        public static final String VIBRATE_ON_CALLWAITING = "vibrate_on_callwaiting";

        /**
         * Whether the phone vibrates on disconnect
         * @hide
         */
        public static final String VIBRATE_ON_DISCONNECT = "vibrate_on_disconnect";

        /**
         * Whether to allow one finger quick settings expansion on the right side of the statusbar.
         *
         * @hide
         */
        public static final String STATUS_BAR_QUICK_QS_PULLDOWN = "qs_quick_pulldown";

        /**
         * Whether the HighTouchPollingRate is activated or not.
         * 0 = off, 1 = on
         * @hide
         */
        public static final String HIGH_TOUCH_POLLING_RATE_ENABLE =
                "high_touch_polling_rate_enable";

        /**
         * Whether the HighTouchSensitivity is activated or not.
         * 0 = off, 1 = on
         * @hide
         */
        public static final String HIGH_TOUCH_SENSITIVITY_ENABLE =
                "high_touch_sensitivity_enable";

        /**
         * Check the proximity sensor during wakeup
         *
         * @hide
         */
        public static final String PROXIMITY_ON_WAKE = "proximity_on_wake";

        /**
         * Whether to wake the display when plugging or unplugging the charger
         *
         * @hide
         */
        public static final String WAKE_WHEN_PLUGGED_OR_UNPLUGGED = "wake_when_plugged_or_unplugged";

        /**
         * List of long-screen apps.
         * @hide
         */
        public static final String LONG_SCREEN_APPS = "long_screen_apps";

        /**
         * Whether or not to vibrate when a touchscreen gesture is detected
         * @hide
         */
        public static final String TOUCHSCREEN_GESTURE_HAPTIC_FEEDBACK = "touchscreen_gesture_haptic_feedback";

        /**
         * Activate torchlight when power button is
         * long-pressed while the display is off
         * The value is boolean (1 or 0).
         * @hide
         */
        public static final String TORCH_LONG_PRESS_POWER_GESTURE =
                "torch_long_press_power_gesture";

        /**
         * When the torch has been turned on by long press on power,
         * automatically turn off after a configurable number of seconds.
         * The value is an integer number of seconds in the range 0-3600.
         * 0 means never automatically turn off.
         * @hide
         */
        public static final String TORCH_LONG_PRESS_POWER_TIMEOUT =
                "torch_long_press_power_timeout";

        /**
         * Whether to scramble a pin unlock layout
         * @hide
         */
        public static final String LOCKSCREEN_PIN_SCRAMBLE_LAYOUT =
                "lockscreen_scramble_pin_layout";

        /**
         * Whether auto brightness is applied one shot when screen is turned on
         * @hide
         */
        public static final String AUTO_BRIGHTNESS_ONE_SHOT = "auto_brightness_one_shot";

        /**
         * Whether to take partial screenshot with volume down + power click.
         * 
         * @hide
         */
        public static final String CLICK_PARTIAL_SCREENSHOT = "click_partial_screenshot";

        /**
         * boolean value. toggles using arrow key locations on nav bar
         * as left and right dpad keys
         * 
         * @hide
         */
        public static final String NAVIGATION_BAR_MENU_ARROW_KEYS = "navigation_bar_menu_arrow_keys";

        /**
         * Whether charging control should be enabled.
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String CHARGING_CONTROL_ENABLED = "charging_control_enabled";

        /**
         * Charging control mode, one of AUTO (1; default), CUSTOM (2), or LIMIT (3).
         * 
         * @hide
         */
        public static final String CHARGING_CONTROL_MODE = "charging_control_mode";

        /**
         * Time when charging control is automatically activated in CUSTOM mode.
         * The value is represented as seconds from midnight.
         * 
         * @hide
         */
        public static final String CHARGING_CONTROL_START_TIME = "charging_control_start_time";

        /**
         * Target time when battery is fully charged in CUSTOM mode.
         * The value is represented as seconds from midnight.
         * 
         * @hide
         */
        public static final String CHARGING_CONTROL_TARGET_TIME = "charging_control_target_time";

        /**
         * Limit to stop charging.
         * 
         * @hide
         */
        public static final String CHARGING_CONTROL_LIMIT = "charging_control_charging_limit";

        /**
         * Whether the battery light should be enabled (if hardware supports it)
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_ENABLED = "battery_light_enabled";

        /**
         * Whether the battery LED should be disabled when the battery is fully charged.
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_FULL_CHARGE_DISABLED = "battery_light_full_charge_disabled";

        /**
         * Whether the battery LED should repeatedly flash when the battery is low
         * on charge. The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_PULSE = "battery_light_pulse";

        /**
         * What color to use for the battery LED while charging - low
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_LOW_COLOR = "battery_light_low_color";

        /**
         * What color to use for the battery LED while charging - medium
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_MEDIUM_COLOR = "battery_light_medium_color";

        /**
         * What color to use for the battery LED while charging - full
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_FULL_COLOR = "battery_light_full_color";

        /**
         * Contains the battery light maximum brightness to use.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_BRIGHTNESS_LEVEL = "battery_light_brightness_level";

        /**
         * Contains the battery light maximum brightness to use when Do Not
         * Disturb is active.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_BRIGHTNESS_LEVEL_ZEN = "battery_light_brightness_level_zen";

        /**
         * Contains the notifications light maximum brightness to use.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_BRIGHTNESS_LEVEL = "notification_light_brightness_level";

        /**
         * Contains the notifications light maximum brightness to use when Do Not
         * Disturb is active.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_BRIGHTNESS_LEVEL_ZEN = "notification_light_brightness_level_zen";

        /**
         * Whether to allow notifications with the screen on or DayDreams.
         * The value is boolean (1 or 0). Default will always be false.
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_SCREEN_ON = "notification_light_screen_on_enable";

        /**
         * What color to use for the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_COLOR = "notification_light_pulse_default_color";

        /**
         * How long to flash the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_LED_ON = "notification_light_pulse_default_led_on";

        /**
         * How long to wait between flashes for the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_LED_OFF = "notification_light_pulse_default_led_off";

        /**
         * What color to use for the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_COLOR = "notification_light_pulse_call_color";

        /**
         * How long to flash the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_LED_ON = "notification_light_pulse_call_led_on";

        /**
         * How long to wait between flashes for the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_LED_OFF = "notification_light_pulse_call_led_off";

        /**
         * What color to use for the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_COLOR = "notification_light_pulse_vmail_color";

        /**
         * How long to flash the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_LED_ON = "notification_light_pulse_vmail_led_on";

        /**
         * How long to wait between flashes for the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_LED_OFF = "notification_light_pulse_vmail_led_off";

        /**
         * Whether to use the custom LED values for the notification pulse LED.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CUSTOM_ENABLE = "notification_light_pulse_custom_enable";

        /**
         * Which custom LED values to use for the notification pulse LED.
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CUSTOM_VALUES = "notification_light_pulse_custom_values";

        /**
         * Whether we automatically generate notification LED colors or just
         * use the boring default.
         *
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_COLOR_AUTO = "notification_light_color_auto";

        /**
         * 1 if we force notifications to not be dismissible if they are ongoing.
         *
         * @hide
         */
        public static final String NOTIFICATION_FORCE_NON_DISMISSIBLE = "notification_force_non_dismissible";

        /**
         * Whether the notification light will be allowed when in zen mode during
         * downtime
         * 
         * @hide
         */
        public static final String ZEN_ALLOW_LIGHTS = "allow_lights";

        /**
         * Whether to show the clock in the right or left position or show it in the
         * center
         * 0: show the clock in the left position (LTR)
         * 1: show the clock in the center
         * 2: show the clock in the right position (LTR)
         * default: 0
         * 
         * @hide
         */
        public static final String STATUS_BAR_CLOCK = "status_bar_clock";

        /**
         * Display style of AM/PM next to clock in status bar
         * 0: No display (Gingerbread/ICS stock)
         * 1: Small display (Froyo stock)
         * 2: Normal display (Eclair stock)
         * default: 0
         * 
         * @hide
         */
        public static final String STATUS_BAR_AM_PM = "status_bar_am_pm";

        /**
         * Swap volume buttons on rotation
         * 
         * @hide
         */
        public static final String SWAP_VOLUME_KEYS_ON_ROTATION = "swap_volume_keys_on_rotation";

        /**
         * Whether to hide clock when launcher is visible
         * default: false
         * 
         * @hide
         */
        public static final String STATUS_BAR_CLOCK_AUTO_HIDE = "status_bar_clock_auto_hide";

        /**
         * Whether the button backlight is only lit when pressed (and not when screen is
         * touched)
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BUTTON_BACKLIGHT_ONLY_WHEN_PRESSED = "button_backlight_only_when_pressed";

        /**
         * Action to perform when the home key is long-pressed.
         * 
         * @hide
         */
        public static final String KEY_HOME_LONG_PRESS_ACTION = "key_home_long_press_action";

        /**
         * Action to perform when the home key is double-tapped.
         * (Default can be configured via config_doubleTapOnHomeBehavior)
         * 
         * @hide
         */
        public static final String KEY_HOME_DOUBLE_TAP_ACTION = "key_home_double_tap_action";

        /**
         * Action to perform when the back key is long-pressed.
         * (Default can be configured via config_longPressOnBackBehavior)
         * (See KEY_HOME_LONG_PRESS_ACTION for valid values)
         * 
         * @hide
         */
        public static final String KEY_BACK_LONG_PRESS_ACTION = "key_back_long_press_action";

        /**
         * Action to perform when the menu key is pressed. (Default is 1)
         * 
         * @hide
         */
        public static final String KEY_MENU_ACTION = "key_menu_action";

        /**
         * Action to perform when the menu key is long-pressed.
         * (Default is 0 on devices with a search key, 3 on devices without)
         * 
         * @hide
         */
        public static final String KEY_MENU_LONG_PRESS_ACTION = "key_menu_long_press_action";

        /**
         * Action to perform when the assistant (search) key is pressed. (Default is 3)
         * 
         * @hide
         */
        public static final String KEY_ASSIST_ACTION = "key_assist_action";

        /**
         * Action to perform when the assistant (search) key is long-pressed. (Default
         * is 4)
         * 
         * @hide
         */
        public static final String KEY_ASSIST_LONG_PRESS_ACTION = "key_assist_long_press_action";

        /**
         * Action to perform when the app switch key is pressed. (Default is 2)
         * 
         * @hide
         */
        public static final String KEY_APP_SWITCH_ACTION = "key_app_switch_action";

        /**
         * Action to perform when the app switch key is long-pressed. (Default is 0)
         * 
         * @hide
         */
        public static final String KEY_APP_SWITCH_LONG_PRESS_ACTION = "key_app_switch_long_press_action";

        /**
         * Whether to wake the screen with the home key, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String HOME_WAKE_SCREEN = "home_wake_screen";

        /**
         * Whether to wake the screen with the back key, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String BACK_WAKE_SCREEN = "back_wake_screen";

        /**
         * Wether to mute audio by pressing the volume up and down keys simultneously on Android TV,
         * the value is boolean.
         * 0 = 0ff, 1 = on
         */
        public static final String VOLUME_UP_AND_DOWN_MUTE = "volume_up_and_down_mute";

        /**
         * Whether to wake the screen with the menu key, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String MENU_WAKE_SCREEN = "menu_wake_screen";

        /**
         * Whether to wake the screen with the volume keys, the value is boolean.
         * 
         * @hide
         */
        public static final String VOLUME_WAKE_SCREEN = "volume_wake_screen";

        /**
         * Whether to wake the screen with the assist key, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String ASSIST_WAKE_SCREEN = "assist_wake_screen";

        /**
         * Whether to wake the screen with the app switch key, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String APP_SWITCH_WAKE_SCREEN = "app_switch_wake_screen";

        /**
         * Whether or not volume button music controls should be enabled to seek media
         * tracks
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String VOLBTN_MUSIC_CONTROLS = "volbtn_music_controls";

        /**
         * Whether to answer the call with the volume keys, the value is boolean.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String VOLUME_ANSWER_CALL = "volume_answer_call";

        /**
         * Whether to wake the screen with the camera key half-press.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String CAMERA_WAKE_SCREEN = "camera_wake_screen";

        /**
         * Whether or not to send device back to sleep if Camera button is released
         * ("Peek")
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String CAMERA_SLEEP_ON_RELEASE = "camera_sleep_on_release";

        /**
         * Whether to launch secure camera app when key is longpressed
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String CAMERA_LAUNCH = "camera_launch";

        /**
         * Whether to enable taskbar.
         * 
         * @hide
         */
        public static final String ENABLE_TASKBAR = "enable_taskbar";

        /**
         * Force show navigation bar setting.
         * 
         * @hide
         */
        public static final String FORCE_SHOW_NAVBAR = "force_show_navbar";

        /**
         * Color temperature of the display during the day
         * 
         * @hide
         */
        public static final String DISPLAY_TEMPERATURE_DAY = "display_temperature_day";

        /**
         * Color temperature of the display at night
         * 
         * @hide
         */
        public static final String DISPLAY_TEMPERATURE_NIGHT = "display_temperature_night";

        /**
         * Display color temperature adjustment mode, one of DAY (default), NIGHT, or
         * AUTO.
         * 
         * @hide
         */
        public static final String DISPLAY_TEMPERATURE_MODE = "display_temperature_mode";

        /**
         * Automatic outdoor mode
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_AUTO_OUTDOOR_MODE = "display_auto_outdoor_mode";

        /**
         * Anti flicker
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_ANTI_FLICKER = "display_anti_flicker";

        /**
         * Reader mode
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_READING_MODE = "display_reading_mode";

        /**
         * Use display power saving features such as CABC or CABL
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_CABC = "display_low_power";

        /**
         * Use color enhancement feature of display
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_COLOR_ENHANCE = "display_color_enhance";

        /**
         * Use auto contrast optimization feature of display
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String DISPLAY_AUTO_CONTRAST = "display_auto_contrast";

        /**
         * Manual display color adjustments (RGB values as floats, separated by spaces)
         * 
         * @hide
         */
        public static final String DISPLAY_COLOR_ADJUSTMENT = "display_color_adjustment";

        /**
         * Did we tell about how they can stop breaking their eyes?
         * 
         * @hide
         */
        public static final String LIVE_DISPLAY_HINTED = "live_display_hinted";

        /**
         * The current custom picture adjustment values as a delimited string
         * 
         * @hide
         */
        public static final String DISPLAY_PICTURE_ADJUSTMENT = "display_picture_adjustment";

        /**
         * Enable statusbar double tap gesture on to put device to sleep
         * 
         * @hide
         */
        public static final String DOUBLE_TAP_SLEEP_GESTURE = "double_tap_sleep_gesture";

        /**
         * Three Finger Gesture
         * 
         * @hide
         */
        public static final String THREE_FINGER_GESTURE = "three_finger_gesture";

        /**
         * GameSpace: List of added games by user
         * 
         * @hide
         */
        public static final String GAMESPACE_GAME_LIST = "gamespace_game_list";

        /**
         * GameSpace: Whether fullscreen intent will be suppressed while in game session
         * 
         * @hide
         */
        public static final String GAMESPACE_SUPPRESS_FULLSCREEN_INTENT = "gamespace_suppress_fullscreen_intent";

        /**
         * @hide
         */
        public static final String TRANSIENT_TASK_MODE = "transient_task_mode";

        /**
         * Show app volume rows in volume panel
         * 
         * @hide
         */
        public static final String SHOW_APP_VOLUME = "show_app_volume";

        /**
         * Action to perform when the screen edge is long-swiped. (Default is 0)
         * (See KEY_HOME_LONG_PRESS_ACTION for valid values)
         * 
         * @hide
         */
        public static final String KEY_EDGE_LONG_SWIPE_ACTION = "key_edge_long_swipe_action";

        /**
         * @hide
         */
        public static final String QS_TRANSPARENCY = "qs_transparency";

        /**
         * Whether to control brightness from status bar
         * 0 = 0ff, 1 = on
         * @hide
         */
        public static final String STATUS_BAR_BRIGHTNESS_CONTROL = "status_bar_brightness_control";

        /**
         * Whether keyguard will rotate
         * 0 = false, 1 = true
         * @hide
         */
        public static final String LOCKSCREEN_ROTATION = "lockscreen_rotation";

    }

    /**
     * Secure settings, containing miscellaneous DerpFest secure preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Secure extends Settings.NameValueTable {
        // region Secure Settings

        /**
         * Whether to show media art on lockscreen
         * Boolean setting. 0 = off, 1 = on.
         * @hide
         */
        public static final String LOCKSCREEN_MEDIA_METADATA = "lockscreen_media_metadata";

        /**
         * Whether touch hovering is enabled on supported hardware
         * @hide
         */
        public static final String FEATURE_TOUCH_HOVERING = "feature_touch_hovering";

        /**
         * Whether to include options in power menu for rebooting into recovery or bootloader
         * @hide
         */
        public static final String ADVANCED_REBOOT = "advanced_reboot";

        /**
         * String to contain power menu actions
         * @hide
         */
        public static final String POWER_MENU_ACTIONS = "power_menu_actions";

        /**
         * Int value specifying the power menu type (default is 0)
         * 0 - Lite
         * 1 - Full
         * 2 - Classic
         * 3 - Grid
         * 4 - Legacy
         * @hide
         */
        public static final String POWER_MENU_TYPE = "power_menu_type";

        /**
         * Whether to show the brightness slider in quick settings panel.
         * 
         * @hide
         */
        public static final String QS_SHOW_BRIGHTNESS_SLIDER = "qs_show_brightness_slider";

        /**
         * Whether to show the auto brightness icon in quick settings panel.
         * 
         * @hide
         */
        public static final String QS_SHOW_AUTO_BRIGHTNESS = "qs_show_auto_brightness";

        /**
         * Whether to use black theme for dark mode
         * 
         * @hide
         */
        public static final String BERRY_BLACK_THEME = "berry_black_theme";

        /**
         * Whether volume panel should appear on the left (or right).
         * 0 = false (on the right)
         * 1 = true (on the left)
         * 
         * @hide
         */
        public static final String VOLUME_PANEL_ON_LEFT = "volume_panel_on_left";

        /**
         * The time in ms to keep the button backlight on after pressing a button.
         * A value of 0 will keep the buttons on for as long as the screen is on.
         * 
         * @hide
         */
        public static final String BUTTON_BACKLIGHT_TIMEOUT = "button_backlight_timeout";

        /**
         * The button brightness to be used while the screen is on or after a button
         * press,
         * depending on the value of {@link BUTTON_BACKLIGHT_TIMEOUT}.
         * Valid value range is between 0 and
         * {@link PowerManager#getMaximumButtonBrightness()}
         * 
         * @hide
         */
        public static final String BUTTON_BRIGHTNESS = "button_brightness";

        /**
         * The keyboard brightness to be used while the screen is on.
         * Valid value range is between 0 and
         * {@link PowerManager#getMaximumKeyboardBrightness()}
         * 
         * @hide
         */
        public static final String KEYBOARD_BRIGHTNESS = "keyboard_brightness";

        /**
         * What happens when the user presses the Home button when the
         * phone is ringing.<br/>
         * <b>Values:</b><br/>
         * 1 - Nothing happens. (Default behavior)<br/>
         * 2 - The Home button answer the current call.<br/>
         *
         * @hide
         */
        public static final String RING_HOME_BUTTON_BEHAVIOR = "ring_home_button_behavior";
        /**
         * RING_HOME_BUTTON_BEHAVIOR value for "do nothing".
         * 
         * @hide
         */
        public static final int RING_HOME_BUTTON_BEHAVIOR_DO_NOTHING = 0x1;
        /**
         * RING_HOME_BUTTON_BEHAVIOR value for "answer".
         * 
         * @hide
         */
        public static final int RING_HOME_BUTTON_BEHAVIOR_ANSWER = 0x2;
        /**
         * RING_HOME_BUTTON_BEHAVIOR default value.
         * 
         * @hide
         */
        public static final int RING_HOME_BUTTON_BEHAVIOR_DEFAULT = RING_HOME_BUTTON_BEHAVIOR_DO_NOTHING;

        /**
         * Whether key swap is enabled on supported hardware
         * 
         * @hide
         */
        public static final String SWAP_CAPACITIVE_KEYS = "swap_capacitive_keys";

        /**
         * Our GameSpace can't write to device_config directly [GTS]
         * Use this as intermediate to pass device_config property
         * from our GameSpace to com.android.server.app.GameManagerService
         * so we can set the device_config property from there.
         * 
         * @hide
         */
        public static final String GAME_OVERLAY = "game_overlay";

        /**
         * Whether to show Wi-Fi standard icon
         * 
         * @hide
         */
        public static final String SHOW_WIFI_STANDARD_ICON = "show_wifi_standard_icon";

        /**
         * Whether user is allowed to interact with quick settings on lockscreen.
         * 
         * @hide
         */
        public static final String QS_TILES_TOGGLEABLE_ON_LOCK_SCREEN = "qs_tiles_toggleable_on_lock_screen";

        /**
         * Whether to enable Ambient edge light
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT = "pulse_ambient_light";
        /**
         * What color to use for Ambient edge light
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_COLOR = "pulse_ambient_light_color";
        /**
         * Duration of Ambient edge light in seconds
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_DURATION = "pulse_ambient_light_duration";
        /**
         * Whether to use color from wallpaper for Ambient edge light
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_COLOR_MODE = "pulse_ambient_light_color_mode";
        /**
         * Number of times to repeat animations of Ambient edge light
         * 0 is never
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_REPEAT_COUNT = "pulse_ambient_light_repeat_count";
        /**
         * Width of Ambient edge light in px
         * 
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_WIDTH = "pulse_ambient_light_width";
        /**
         * Whether to show ambient edge light only when device is face down
         * 0 = false, 1 = true
         *
         * @hide
         */
        public static final String PULSE_AMBIENT_LIGHT_FACE_DOWN = "pulse_ambient_light_face_down";

        /**
         * Whether tethering is allowed to use VPN upstreams
         * 0 = false, 1 = true
         */
        public static final String TETHERING_ALLOW_VPN_UPSTREAMS = "tethering_allow_vpn_upstreams";

        /**
         * UDFPS animation style
         *
         * @hide
         */
        public static final String UDFPS_ANIM_STYLE = "udfps_anim_style";

        /**
         * Whether keyguard will direct show security view (0 = false, 1 = true)
         * @hide
         */
        public static final String LOCK_PASS_TO_SECURITY_VIEW = "lock_screen_pass_to_security_view";

        /**
         * Whether to show the menu key always in the nav bar
         * regardless of the context when it's configured in the layout.
         * @hide
         */
        public static final String NAV_BAR_FORCE_MENU_KEY = "nav_bar_force_menu_key";
    }

    /**
     * Global settings, containing miscellaneous DerpFest global preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Global extends Settings.NameValueTable {
        // region Global Settings

        /**
         * Restrict USB
         * 0 = Off, never
         * 1 = Only when the screen is locked
         * 2 = On, always
         *
         * @hide
         */
        public static final String TRUST_RESTRICT_USB = "trust_restrict_usb";

        /**
         * Package designated as global VPN provider.
         * 
         * @hide
         */
        public static final String GLOBAL_VPN_APP = "global_vpn_app";

        /**
         * Global cleartext (aka non-TLS) traffic blocking
         *
         * Values are:
         * -1: StrictMode.NETWORK_POLICY_INVALID - Remove global cleartext traffic rule
         *  0: StrictMode.NETWORK_POLICY_ACCEPT - Allow all cleartext traffic.
         *  1: StrictMode.NETWORK_POLICY_LOG - Log all cleartext traffic.
         *     Does not appear in logcat by default. Uses existing StrictMode logging
         *     for cleartext network penalties.
         *  2: StrictMode.NETWORK_POLICY_REJECT - Reject all cleartext traffic.
         * @hide
         */
        public static final String CLEARTEXT_NETWORK_POLICY = "cleartext_network_policy";

        /**
         * The amount of time in milliseconds before the device automatically reboots
         * 
         * @hide
         */
        public static final String DEVICE_REBOOT_TIMEOUT = "device_reboot_timeout";

    }

    public static final class Panel {

        /**
         * Activity Action: Show a settings dialog containing all app volume streams.
         * <p>
         * Input: Nothing.
         * <p>
         * Output: Nothing.
         */
        public static final String ACTION_APP_VOLUME =
                "android.settings.panel.action.APP_VOLUME";
    }

}
