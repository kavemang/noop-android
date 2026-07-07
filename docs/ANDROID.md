# Android Development

This document covers the maintained Android app in this repository. The active project is the Gradle app under [`android/`](../android), with releases published as APK assets from this repository.

## Requirements

- JDK 17
- Android SDK Platform 34
- Android SDK Build Tools 34.0.0
- Android platform tools
- A physical Android device for BLE validation

Open the Android project:

```bash
cd android
```

## Build Variants

The primary release artifact is the full APK:

```bash
./gradlew assembleFullRelease
```

Useful development commands:

```bash
./gradlew assembleFullDebug
./gradlew testFullDebugUnitTest
./gradlew assembleFullRelease
```

Release output:

```text
android/app/build/outputs/apk/full/release/app-full-release.apk
```

Published release asset name:

```text
NOOP-full.apk
```

## Release Signing

Release builds read local signing settings from `android/keystore.properties` when present. Keep this file local-only and do not commit it.

Expected keys:

```properties
storeFile=/path/to/noop-android-release.jks
storePassword=...
keyAlias=noop-release
keyPassword=...
```

The signing key is the Android update identity. Devices that installed an APK signed with one key can only update to later APKs signed with the same key for the same application id.

## APK Verification

From the repository root:

```bash
ANDROID_SDK="${ANDROID_HOME:-$HOME/Android/Sdk}"
APK=release-artifacts/NOOP-full.apk

$ANDROID_SDK/build-tools/34.0.0/apksigner verify --verbose "$APK"
$ANDROID_SDK/build-tools/34.0.0/apksigner verify --print-certs "$APK"
$ANDROID_SDK/build-tools/34.0.0/aapt dump permissions "$APK"
sha256sum "$APK"
```

Before publishing a release, verify:

- The APK is signed by the expected release certificate.
- Runtime permissions match the Android privacy model.
- The app installs over the previous release on a test device.
- BLE scan, connect, live heart rate, sync, and core screens work on real hardware.

## Maintained Scope

Android-focused changes are in scope:

- Kotlin and Jetpack Compose UI
- BLE connection, pairing, sync, and protocol behavior
- Room schema, migrations, and local data handling
- Android imports, exports, backups, and diagnostics
- Android notifications, alarms, and haptics
- Android tests, build tooling, signing, and release automation

Historical non-Android source may remain in the repository for attribution and reference, but it is not the maintained product surface.

## Network Posture

Core strap collection and analytics are local-first:

- No WHOOP account login is required.
- Strap data is stored locally on the device.
- Computed metrics are generated on-device.
- Project-operated servers are not required for normal strap collection.

Optional features that use network access should be explicit, user-configured, and documented in the UI.
