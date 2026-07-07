package com.noop.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HourglassEmpty
import androidx.compose.material.icons.outlined.Science
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.ui.graphics.vector.ImageVector

object AppChangelog {

    /**
     * Bump this when adding an Android release below. The "What's New" sheet shows automatically
     * when the stored last-seen version is behind this.
     */
    const val CURRENT_VERSION = "8.2.2"

    data class Release(
        val version: String,
        val title: String,
        val date: String,
        val items: List<String>,
    )

    /** Newest first. */
    val releases: List<Release> = listOf(
        Release(
            version = "8.2.2",
            title = "Android-only project reset",
            date = "July 2026",
            items = listOf(
                "**Android-only releases.** NOOP Android now checks GitHub releases from the standalone Android repository.",
                "**Cleaner support links.** Issue reports, project links, and support screens now point to the Android repository.",
                "**Local-first behavior stays the same.** Strap data, analytics, backups, and imports remain on-device unless you explicitly configure an optional network-backed feature.",
            ),
        ),
        Release(
            version = "8.2.1",
            title = "Android release baseline",
            date = "July 2026",
            items = listOf(
                "**Release signing is ready.** Android release builds can use the local release keystore configured on this machine.",
                "**Release artifact.** The published Android APK is named `NOOP-full.apk`.",
                "**Build verification.** Debug build, unit tests, and release build are the required local release checks.",
            ),
        ),
    )

    data class Expectation(
        val icon: ImageVector,
        val title: String,
        val body: String,
    )

    val expectations: List<Expectation> = listOf(
        Expectation(
            icon = Icons.Outlined.Science,
            title = "Independent, and experimental",
            body = "NOOP Android is an independent interoperability project. It reads compatible hardware you own, on your Android device. Treat it as a capable work in progress rather than a finished product.",
        ),
        Expectation(
            icon = Icons.Outlined.VerifiedUser,
            title = "WHOOP 4.0 is the supported path",
            body = "WHOOP 4.0 is the most tested path. WHOOP 5.0/MG support is newer: live heart rate works today, while deeper metrics are still being validated.",
        ),
        Expectation(
            icon = Icons.Outlined.HourglassEmpty,
            title = "Your scores build over a few nights",
            body = "Live heart rate is instant. Recovery, strain and sleep sharpen as NOOP Android learns your baseline over your first nights of wear. You can import supported local data sources to backfill history.",
        ),
        Expectation(
            icon = Icons.Outlined.Shield,
            title = "Everything stays on your device",
            body = "No WHOOP account, no project cloud, no telemetry. NOOP Android talks to your strap and keeps core data local on your phone.",
        ),
    )
}
