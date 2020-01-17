package CommandPattern;

interface Command {
    void execute();
}
class light{
    public void on(){
        System.out.println("The light is on");
    }
    public void off(){
        System.out.println("The light is off");
    }
}

class commandLightOn implements Command{
    light light;
    public commandLightOn(light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class commandLightOff implements Command{
    light light;
    public commandLightOff(light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}

class simpleRemote{
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void buttonWasPressed(){
        command.execute();
    }
}

class Command_Pattern{
    public static void main(String[] args) {
        simpleRemote remote = new simpleRemote();
        light light = new light();
        remote.setCommand(new commandLightOff(light));
        remote.buttonWasPressed();

        remote.setCommand(new commandLightOn(light));
        remote.buttonWasPressed();
    }
}