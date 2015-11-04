/**
 */
package codingExperimentOntology.variables;

import codingExperimentOntology.apparatus.TimeMonitorInstrument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Bound Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.TimeBoundVariable#getTimeMonitor <em>Time Monitor</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.variables.NewPackage1Package#getTimeBoundVariable()
 * @model
 * @generated
 */
public interface TimeBoundVariable extends CodingDependentVariable {
	/**
	 * Returns the value of the '<em><b>Time Monitor</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.TimeMonitorInstrument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Monitor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Monitor</em>' reference list.
	 * @see codingExperimentOntology.variables.NewPackage1Package#getTimeBoundVariable_TimeMonitor()
	 * @model
	 * @generated
	 */
	EList<TimeMonitorInstrument> getTimeMonitor();

} // TimeBoundVariable
