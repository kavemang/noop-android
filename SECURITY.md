# Security Policy

## Scope

NOOP Android is a local-first Android app. Relevant security reports include issues that:

- Let strap, health, backup, import, or diagnostic data leave the device unexpectedly.
- Allow a malicious BLE peripheral or crafted import file to crash the app, corrupt local data, or execute code.
- Break Android keystore handling for user-configured secrets.
- Expose private local files or diagnostics without explicit user action.

## Reporting

Report security issues through GitHub issues:

<https://github.com/kavemang/noop-android/issues>

If a public proof of concept would put users at immediate risk, open a short issue with the affected area and severity, then hold exploit details until a fix is ready.

## Supported Versions

Only the latest Android release receives fixes.

## Out Of Scope

- Issues requiring physical access to an already-unlocked phone.
- Third-party dependency vulnerabilities that should be reported to the dependency maintainer.
- WHOOP strap firmware issues.
- Misuse of a user-supplied API key after the user intentionally configured it.
