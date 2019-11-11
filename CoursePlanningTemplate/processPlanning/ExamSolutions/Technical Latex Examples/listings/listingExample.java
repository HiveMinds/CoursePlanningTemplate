// init policy
for (int s = 0; s < cmdp.getNumStates(); s++) {
	for (int a = 0; a < cmdp.getNumActions(); a++) {
		policy[s][a] = 0;
	}
}

int bestVNextArg = -1; // action associated with bestVNext

for (int s = 0; s < cmdp.getNumStates(); s++) {
	bestVNext = Double.NEGATIVE_INFINITY;
	bestVNextArg = -1;
	for (int a = 0; a < cmdp.getNumActions(); a++) {
		nextStateValue = 0;
		// calculate expected value of next state
		for (int sNext = 0; sNext < cmdp.getNumStates(); sNext++) {
			nextStateValue += cmdp.getTransitionProbability(s, a, sNext) * V[sNext];
		}
		
		// determine value of V[s] in the next iteration
		vNext = cmdp.getReward(s, a) + discountFactor * nextStateValue;
		if (vNext > bestVNext) {
			bestVNext = vNext;
			bestVNextArg = a;
		}
	}
	policy[s][bestVNextArg] = 1;
}