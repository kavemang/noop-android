# Android Contribution Guide

NOOP Android is maintained as a native Android app.

## Before Opening A PR

- Build the Android debug app.
- Run the Android JVM unit tests.
- For release or signing changes, build a release APK.
- For BLE changes, test on real hardware.

```bash
cd android
./gradlew assembleFullDebug testFullDebugUnitTest
```

## Android Areas

- `android/app/src/main/java/com/noop/ble`: BLE connection, sync, and device behavior
- `android/app/src/main/java/com/noop/protocol`: protocol decode and frame handling
- `android/app/src/main/java/com/noop/data`: Room entities, DAOs, migrations, repositories
- `android/app/src/main/java/com/noop/ui`: Jetpack Compose screens and components
- `android/app/src/test`: JVM unit tests

## Review Expectations

- Keep changes small enough to review.
- Add or update tests for behavior changes.
- Preserve local-first privacy defaults.
- Avoid new network access unless the feature is explicit and user-configured.
- Do not add telemetry or account requirements.
