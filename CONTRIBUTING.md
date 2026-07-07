# Contributing To NOOP Android

Thanks for helping with NOOP Android. This repository is maintained for the Android app only.

## Quick Start

```bash
cd android
./gradlew assembleFullDebug
./gradlew testFullDebugUnitTest
```

Use JDK 17 and Android SDK Platform 34 / Build Tools 34.0.0.

## Good Pull Requests

- Keep each PR focused on one concern.
- For BLE work, include the strap model, Android device, Android version, and what was tested on real hardware.
- For database changes, include the migration and a focused test.
- For analytics changes, include a test and explain the method being implemented.
- For UI changes, follow the existing Kotlin / Jetpack Compose patterns.
- Do not commit keystores, local SDK paths, logs with personal data, or generated build outputs.

## Project Scope

In scope:

- Android Kotlin and Jetpack Compose UI
- BLE connection, sync, diagnostics, and protocol behavior
- Room schema and migrations
- Android imports, exports, backups, and storage
- Android build, signing, and release tooling
- Android documentation

Out of scope for this repository:

- Non-Android release work
- Cloud sync, telemetry, or account systems

## Issues

Use GitHub issues for bugs and feature requests:

<https://github.com/kavemang/noop-android/issues>

NOOP Android is local-first, so avoid attaching anything that identifies you. For connection bugs, include the app version, phone model, Android version, strap model, and a redacted diagnostic report when possible.

## License

By contributing, you agree that your contribution is licensed under the same terms as the project. See [`LICENSE`](LICENSE).
