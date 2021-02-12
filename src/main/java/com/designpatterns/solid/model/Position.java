package com.designpatterns.solid.model;

public enum Position {

    ASSISTANT {
        @Override
        public Position nextPosition() {
            return ANALYST;
        }
    },
    ANALYST {
        @Override
        public Position nextPosition() {
            return SPECIALIST;
        }
    },
    SPECIALIST {
        @Override
        public Position nextPosition() {
            return MANAGER;
        }
    },
    MANAGER {
        @Override
        public Position nextPosition() {
            return MANAGER;
        }
    };

    public abstract Position nextPosition();

}
