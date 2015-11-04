/**
 */
package codingExperimentOntology.variables;

import codingExperimentOntology.apparatus.ResourceMonitorInstrument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Based Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.ResourceBasedVariable#getResourceMonitor <em>Resource Monitor</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.variables.NewPackage1Package#getResourceBasedVariable()
 * @model
 * @generated
 */
public interface ResourceBasedVariable extends TimeBoundVariable {
	/**
	 * Returns the value of the '<em><b>Resource Monitor</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.ResourceMonitorInstrument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Monitor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Monitor</em>' reference list.
	 * @see codingExperimentOntology.variables.NewPackage1Package#getResourceBasedVariable_ResourceMonitor()
	 * @model required="true"
	 * @generated
	 */
	EList<ResourceMonitorInstrument> getResourceMonitor();

} // ResourceBasedVariable
