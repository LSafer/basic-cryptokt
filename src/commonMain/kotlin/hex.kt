package net.lsafer.crypto

// byte[] => hex

expect fun ByteArray.encodeHex(): String

// string => hex

expect fun String.encodeHex(): String

// hex => byte[]

expect fun String.decodeHex(): ByteArray

// hex => string

expect fun String.decodeHexToString(): String
