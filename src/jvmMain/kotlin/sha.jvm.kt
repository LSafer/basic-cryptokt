package net.lsafer.crypto

import java.security.MessageDigest

actual fun ByteArray.sha256(): ByteArray {
    val digest = MessageDigest.getInstance("SHA-256")
    return digest.digest(this)
}

actual fun ByteArray.sha384(): ByteArray {
    val digest = MessageDigest.getInstance("SHA-384")
    return digest.digest(this)
}

actual fun ByteArray.sha512(): ByteArray {
    val digest = MessageDigest.getInstance("SHA-512")
    return digest.digest(this)
}

actual fun String.sha256(): ByteArray {
    return encodeToByteArray().sha256()
}

actual fun String.sha384(): ByteArray {
    return encodeToByteArray().sha384()
}

actual fun String.sha512(): ByteArray {
    return encodeToByteArray().sha512()
}
