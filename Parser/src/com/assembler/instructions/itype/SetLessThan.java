package com.assembler.instructions.itype;

import com.assembler.Echo;
import com.assembler.Instruction;
import com.assembler.State;

public class SetLessThan extends Instruction {

	public SetLessThan() {
		super("slt", "1010000000000000");
	}

	@Override
	public void runProcedure() {
		int a = State.stack.pop();
		int b = State.stack.pop();
		int value=0;
		if(a<b)value=1;
		State.stack.push(value);
		Echo.print("Performing Slt On Stack: "+a+"<"+b+"="+value);
		super.runProcedure();
	}

}
