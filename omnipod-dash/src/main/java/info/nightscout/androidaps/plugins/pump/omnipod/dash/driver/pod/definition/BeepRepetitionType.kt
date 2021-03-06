package info.nightscout.androidaps.plugins.pump.omnipod.dash.driver.pod.definition

// FIXME names
enum class BeepRepetitionType(
    val value: Byte
) {

    XXX(0x01.toByte()), // Used in lump of coal alert
    XXX2(0x03.toByte()), // Used in low reservoir alert
    XXX3(0x05.toByte()), // Used in user pod expiration alert
    XXX4(0x06.toByte()), // Used in pod expiration alert
    XXX5(0x08.toByte()); // Used in imminent pod expiration alert
}
