# Build NOOP Android

## Requirements

- JDK 17
- Android SDK Platform 34
- Android SDK Build Tools 34.0.0
- Android platform tools

## Commands

```bash
cd android
./gradlew assembleFullDebug
./gradlew testFullDebugUnitTest
./gradlew assembleFullRelease
```

Release APK:

```text
android/app/build/outputs/apk/full/release/app-full-release.apk
```

Published asset name:

```text
NOOP-full.apk
```

## Signing

Release signing is configured by local-only `android/keystore.properties`.

```properties
storeFile=/path/to/noop-android-release.jks
storePassword=...
keyAlias=noop-release
keyPassword=...
```

Do not commit keystores or signing credentials.

## Verification

```bash
ANDROID_SDK="${ANDROID_HOME:-$HOME/Android/Sdk}"
APK=release-artifacts/NOOP-full.apk

$ANDROID_SDK/build-tools/34.0.0/apksigner verify --verbose "$APK"
$ANDROID_SDK/build-tools/34.0.0/apksigner verify --print-certs "$APK"
$ANDROID_SDK/build-tools/34.0.0/aapt dump permissions "$APK"
sha256sum "$APK"
```
