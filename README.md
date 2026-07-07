# NOOP Android

NOOP Android is a native Android companion app for WHOOP straps. It connects to a strap over Bluetooth Low Energy, stores data locally on the phone, and computes recovery, strain, HRV, sleep, workouts, and related metrics on-device.

This repository is maintained for Android development only.

## Status

- Platform: Android 8.0+ (`minSdk 26`)
- App id: `com.noop.whoop`
- UI: Kotlin + Jetpack Compose
- Storage: Room / SQLite on the device
- Build: Gradle Android project under [`android/`](android/)
- Releases: APKs are published from this repository's GitHub Releases page

The current published Android artifact is:

- `NOOP-full.apk`

## Download

Download the latest Android APK from:

<https://github.com/kavemang/noop-android/releases/latest>

Install by sideloading the APK on your Android device. Android may warn that the app comes from an unknown source because it is distributed outside the Play Store.

## What It Does

- Connects directly to supported WHOOP straps over BLE.
- Reads live heart rate, strap battery, R-R intervals, and available sensor/history data.
- Stores decoded data locally on the phone.
- Computes metrics locally, including recovery, strain, HRV, sleep, stress, workouts, trends, and readiness-style summaries.
- Imports supported local data sources such as WHOOP exports and Android health data sources where implemented.
- Provides optional local notifications, alarms, haptic sessions, breathing sessions, and workout tools.

## Privacy

NOOP Android is designed around local ownership of your data:

- No WHOOP account login is required.
- Strap data and computed metrics are stored locally.
- Core strap collection and analytics do not require a project-operated server.
- Optional features such as AI Coach may use network access only when configured by the user with their own provider or endpoint.

Before publishing releases, verify the merged Android manifest permissions and make sure they match the intended privacy model.

## Build From Source

Requirements:

- JDK 17
- Android SDK Platform 34
- Android SDK Build Tools 34.0.0
- Android platform tools

Open the Android project:

```bash
cd android
```

Build and test:

```bash
./gradlew assembleFullDebug
./gradlew testFullDebugUnitTest
./gradlew assembleFullRelease
```

Release APK output:

```text
android/app/build/outputs/apk/full/release/app-full-release.apk
```

The release asset should be copied or renamed to:

```text
NOOP-full.apk
```

## Release Signing

Release builds use `android/keystore.properties` when present. That file is local-only and must never be committed.

Expected local signing config keys:

```properties
storeFile=/path/to/noop-android-release.jks
storePassword=...
keyAlias=noop-release
keyPassword=...
```

The Android signing key is the app update identity. If users install an APK signed with one key, future APKs for the same application id must be signed with the same key or Android will reject the update.

## Verify A Release APK

```bash
ANDROID_SDK="${ANDROID_HOME:-$HOME/Android/Sdk}"

$ANDROID_SDK/build-tools/34.0.0/apksigner verify --verbose NOOP-full.apk
$ANDROID_SDK/build-tools/34.0.0/apksigner verify --print-certs NOOP-full.apk
$ANDROID_SDK/build-tools/34.0.0/aapt dump permissions NOOP-full.apk
sha256sum NOOP-full.apk
```

## Repository Layout

The Android app lives in:

```text
android/
  app/
  build.gradle.kts
  settings.gradle.kts
  gradlew
```

The repository may still contain historical non-Android source and documentation for attribution and reference. The maintained surface is the Android app, Android build configuration, Android docs, and Android release process.

## Contributing

Android-focused changes are welcome:

- Kotlin / Compose UI
- BLE connection and sync behavior
- Android data import/export
- Room schema and migrations
- Android tests
- Android build and release tooling
- Documentation for the Android app

For BLE or protocol changes, include the strap model tested and what was verified on real hardware.

## Attribution

NOOP Android is an independent, unofficial interoperability project. It is not affiliated with, endorsed by, or connected to WHOOP, Inc. "WHOOP" is used only to identify compatible hardware.

The codebase builds on community protocol research and source-available NOOP work. Keep existing license, attribution, and notice files intact when reusing or redistributing the source.

## Disclaimer

NOOP Android is not a medical device. Metrics such as recovery, strain, HRV, sleep, stress, respiratory rate, SpO2, and related summaries are approximations and are not medical advice.

Use it only with hardware and data you own, and at your own risk.

## License

This repository keeps the existing license terms in [`LICENSE`](LICENSE) and notices in [`NOTICE`](NOTICE). Review them before redistributing, relicensing, or using the code commercially.
