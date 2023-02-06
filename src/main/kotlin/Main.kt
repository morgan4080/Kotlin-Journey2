fun main() {
    /*
        Assembler:

        - Create a dictionary that maps the assembly instructions to their corresponding bytecode representation.
        - Read the input assembly file line by line and parse each line to extract the instruction, the register numbers, and the immediate value (if applicable).
        - Use the extracted information to encode the instruction into its bytecode representation by looking it up in the dictionary.
        - Write the encoded bytecode to an output file.
    */



    /*
        Simulator:

        - Read the input bytecode file into memory.
        - Create a dictionary that maps the bytecode representation of each instruction to its corresponding function.
        - Initialize the registers and PC.
        - Start executing the instructions in a loop:
            * Fetch the instruction at the PC.
            * Increment the PC.
            * Decode the instruction by looking it up in the dictionary and execute its corresponding function.
            * Log the register values.
            * Repeat the loop until the halt instruction is executed.
    */
}