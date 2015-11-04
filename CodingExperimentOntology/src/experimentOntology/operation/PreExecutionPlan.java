/**
 */
package experimentOntology.operation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.PreExecutionPlan#getPretasks <em>Pretasks</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getPreExecutionPlan()
 * @model
 * @generated
 */
public interface PreExecutionPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Pretasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pretasks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pretasks</em>' containment reference.
	 * @see #setPretasks(PreTasks)
	 * @see experimentOntology.operation.OperationPackage#getPreExecutionPlan_Pretasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreTasks getPretasks();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.PreExecutionPlan#getPretasks <em>Pretasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretasks</em>' containment reference.
	 * @see #getPretasks()
	 * @generated
	 */
	void setPretasks(PreTasks value);

} // PreExecutionPlan
