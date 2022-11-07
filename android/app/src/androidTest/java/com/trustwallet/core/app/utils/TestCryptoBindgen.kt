// Copyright © 2017-2022 Trust Wallet.
//
// This file is part of Trust. The full Trust copyright notice, including
// terms governing use, modification, and redistribution, is contained in the
// file LICENSE at the root of the source code distribution tree.

package com.trustwallet.core.app.utils

import com.trustwallet.core.app.utils.Numeric
import com.trustwallet.core.app.utils.toHex
import com.trustwallet.core.app.utils.toHexByteArray
import wallet.core.jni.*
import java.security.InvalidParameterException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class TestCryptoBindgen {
    init {
        System.loadLibrary("TrustWalletCore");
    }

    @Test
    fun testRustFunction() {
        assertEquals(CryptoBindgen.rustFunction(), 42)
    }
}