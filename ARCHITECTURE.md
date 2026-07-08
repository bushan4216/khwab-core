# Khwab Core Architecture

## BrainV2

BrainV2 is the central orchestration layer.

It coordinates:

- Parser
- Validator
- Reasoning Engine
- Decision Engine
- Skill Manager
- Planner
- Response Generator

---

## Reasoning Engine

Responsible for understanding whether a command contains enough information.

Outputs:

- READY
- NEEDS_CLARIFICATION
- INSUFFICIENT_INFORMATION
- UNSUPPORTED
- BLOCKED

---

## Decision Engine

Produces one of:

- EXECUTE
- ASK_USER
- REJECT
- BLOCK

---

## Skill Framework

Each capability is implemented as a Skill.

Current Skills

- AppSkill

Future Skills

- CallSkill
- MessageSkill
- MediaSkill
- SearchSkill
- SettingsSkill

---

## Planning

The planner creates a platform-independent execution plan.

Plan

↓

PlanStep

↓

ActionType

↓

Android Executor

---

## Testing

Current automated tests cover:

- Brain
- BrainV2
- SkillManager
