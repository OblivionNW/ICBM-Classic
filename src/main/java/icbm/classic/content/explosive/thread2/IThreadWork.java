package icbm.classic.content.explosive.thread2;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/8/2018.
 */
public interface IThreadWork
{
    /**
     * Called to run the work
     *
     * @param steps - number of steps to run
     * @return true to keep running, false to end work task
     */
    boolean doRun(int steps);

    /**
     * Called when work is started
     */
    void onStarted();

    /**
     * Called when the work is completed
     */
    void onCompleted();

    /**
     * Called to get the number of steps required
     *
     * @return
     */
    default int getStepsRequired()
    {
        return 1;
    }

    /**
     * Called to get the number of steps left.
     * Only used for debug.
     *
     * @return
     */
    default int getStepsLeft()
    {
        return -1;
    }
}
