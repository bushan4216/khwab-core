# Khwab Core Architecture

Voice
   │
   ▼
Parser
   │
   ▼
BrainV2
   │
   ├── Reasoning Engine
   ├── Decision Engine
   └── Skill Manager
            │
            ▼
      Skill Registry
            │
            ├── AppSkill
            ├── CallSkill
            ├── MessageSkill
            ├── MediaSkill
            ├── SearchSkill
            └── SettingsSkill
                    │
                    ▼
                 Planner
                    │
                    ▼
                ActionType
                    │
                    ▼
                  Plan
                    │
                    ▼
          Android Executor (Sprint 18)
