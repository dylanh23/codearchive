import java.util.HashMap;
import java.util.Objects;

/**
 * Created by dhare on 6/8/2017.
 */
public class HashmapObjectKey {
    HashMap<State, Integer> map = new HashMap();

    class State {
        int numL;
        boolean A;
        int n;
        State (int numL, boolean A, int n) {
            this.numL = numL;
            this.A = A;
            this.n = n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(numL, A, n);
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (!(obj instanceof State))
                return false;
            final State state = (State) obj;
            return state.numL == numL && state.A == A && state.n == n;
        }
    }
}
