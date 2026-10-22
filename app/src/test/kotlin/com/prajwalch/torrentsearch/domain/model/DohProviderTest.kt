package com.prajwalch.torrentsearch.domain.model

import org.junit.Assert.assertEquals
import org.junit.Test

class DohProviderTest {
    @Test
    fun fromId_returnsMatchingProvider_forKnownId() {
        assertEquals(DohProvider.Quad9, DohProvider.fromId("quad9"))
    }

    @Test
    fun fromId_returnsDefault_forRemovedMullvadId() {
        assertEquals(DohProvider.Default, DohProvider.fromId("mullvad"))
    }

    @Test
    fun fromId_returnsDefault_forUnknownOrEmptyId() {
        assertEquals(DohProvider.Default, DohProvider.fromId(""))
        assertEquals(DohProvider.Default, DohProvider.fromId("no-such-provider"))
    }
}
