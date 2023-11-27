package net.lsafer.crypto

expect fun ByteArray.sha256(): ByteArray

expect fun ByteArray.sha384(): ByteArray

expect fun ByteArray.sha512(): ByteArray

expect fun String.sha256(): ByteArray

expect fun String.sha384(): ByteArray

expect fun String.sha512(): ByteArray
