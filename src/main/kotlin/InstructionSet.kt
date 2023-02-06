class InstructionSet {
    var INSTRUCTIONS: HashMap<String, Int> = HashMap()

    init {
        INSTRUCTIONS["halt"] = 0x00;
        INSTRUCTIONS["nop"] = 0x01;
        INSTRUCTIONS["li"] = 0x02;
        INSTRUCTIONS["lw"] = 0x03;
        INSTRUCTIONS["sw"] = 0x04;
        INSTRUCTIONS["add"] = 0x05;
        INSTRUCTIONS["sub"] = 0x06;
        INSTRUCTIONS["mult"] = 0x07;
        INSTRUCTIONS["div"] = 0x08;
        INSTRUCTIONS["j"] = 0x09;
        INSTRUCTIONS["jr"] = 0x0A;
        INSTRUCTIONS["beq"] = 0x0B;
        INSTRUCTIONS["bne"] = 0x0C;
        INSTRUCTIONS["inc"] = 0x0D;
        INSTRUCTIONS["dec"] = 0x0E;
    }

    fun pullSet () {
        val instruction = "li";
        val bytecode = INSTRUCTIONS[instruction];
        println("Bytecode for " + instruction + " is: 0x" + bytecode?.let { Integer.toHexString(it) });
    }
}