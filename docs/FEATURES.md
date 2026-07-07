# Android Features

NOOP Android is a native Android app for local-first WHOOP strap data collection and on-device analysis.

## Strap Data

- Bluetooth Low Energy scan, pairing, and connection flow
- Live heart rate display
- Strap battery state
- R-R interval collection where available
- Stored sensor/history sync where supported by the strap firmware
- Local diagnostics and report export for connection or sync issues

## Local Metrics

NOOP Android computes practical, approximate summaries from locally available data:

- Recovery-style readiness
- Strain and daily load
- HRV and resting heart rate trends
- Sleep and sleep-stage summaries
- Stress and respiratory-related summaries where data is available
- Workout and activity summaries
- Longer-term trends and baselines

These are approximations for self-tracking. They are not WHOOP scores and they are not medical advice.

## App Tools

- Today dashboard
- Health, sleep, workouts, stress, insights, and trends screens
- Manual workout tools
- Breathing sessions
- Haptic and alarm features where supported
- Optional notifications
- Local backup, import, export, and storage tools
- Test Centre diagnostics for reproducible bug reports

## Data Ownership

- No WHOOP account login is required.
- Core strap data stays on the phone.
- The local database is Room / SQLite.
- Backups and exports are user-controlled files.
- Optional network-backed features must be configured by the user.

## Android Release Surface

The maintained artifact is:

```text
NOOP-full.apk
```

Releases are published from this repository:

<https://github.com/kavemang/noop-android/releases/latest>

See [`ANDROID.md`](ANDROID.md) for build, signing, and verification notes.
