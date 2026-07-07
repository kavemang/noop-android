# NOOP Android

Native Android app for local-first WHOOP strap data, BLE sync, and on-device analytics.

## Requirements

- JDK 17
- Android SDK Platform 34
- Android SDK Build Tools 34.0.0
- Android platform tools
- A physical Android device for BLE testing

## Build

```bash
./gradlew assembleFullDebug
./gradlew testFullDebugUnitTest
./gradlew assembleFullRelease
```

Release APK:

```text
app/build/outputs/apk/full/release/app-full-release.apk
```

Debug APK:

```text
app/build/outputs/apk/full/debug/app-full-debug.apk
```

## Project Layout

```text
android/
  settings.gradle.kts
  build.gradle.kts
  app/
    build.gradle.kts
    src/main/
    src/test/
```

Root package: `com.noop`

Application id: `com.noop.whoop`

## Privacy Posture

Core strap collection and analytics are local-first:

- No WHOOP account login is required.
- Strap data is stored locally on the phone.
- Analytics are computed on-device.
- Optional network-backed features must be explicitly configured by the user.

## BLE Verification

Use a real Android phone and strap for BLE work. Emulators cannot validate scan, connect, GATT sequencing, live heart rate, history sync, haptics, or reconnect behavior.

For BLE changes, record:

- Phone model
- Android version
- Strap model and firmware, if known
- Whether scan, connect, live heart rate, history sync, and reconnect were tested
