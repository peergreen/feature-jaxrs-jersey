/**
 * Peergreen S.A.S. All rights reserved.
 * Proprietary and confidential.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.peergreen.jaxrs.jersey;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.annotation.HandlesTypes;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.Provider;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.glassfish.jersey.servlet.init.JerseyServletContainerInitializer;

/**
 * This component is registering Jersey as Servlet Container Initializer
 * @author Florent Benoit
 */
@Component
@Instantiate
@Provides(specifications={ServletContainerInitializer.class})
@HandlesTypes({Path.class, Provider.class, Application.class, ApplicationPath.class})
public class PeergreenJerseyServletContainerInitializer extends JerseyServletContainerInitializer {

}
