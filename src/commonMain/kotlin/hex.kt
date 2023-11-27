package net.lsafer.crypto

expect fun ByteArray.encodeHex(): String

expect fun String.decodeHex(): ByteArray

expect fun String.encodeHex(): String

expect fun String.decodeHexToString(): String
