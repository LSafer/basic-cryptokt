package net.lsafer.crypto

expect fun ByteArray.encodeBase64(): String

expect fun ByteArray.encodeBase64(offset: Int, length: Int = size): String

expect fun ByteArray.encodeBase64UrlSafe(): String

expect fun ByteArray.encodeBase64UrlSafe(offset: Int, length: Int = size): String

expect fun String.encodeBase64(): String

expect fun String.encodeBase64(offset: Int, length: Int = this.length): String

expect fun String.encodeBase64UrlSafe(): String

expect fun String.encodeBase64UrlSafe(offset: Int, length: Int = this.length): String

expect fun String.decodeBase64(): ByteArray

expect fun String.decodeBase64UrlSafe(): ByteArray

expect fun String.decodeBase64ToString(): String

expect fun String.decodeBase64UrlSafeToString(): String
