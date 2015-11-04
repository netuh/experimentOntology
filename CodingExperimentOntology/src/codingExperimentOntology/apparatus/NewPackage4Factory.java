/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.apparatus.NewPackage4Package
 * @generated
 */
public interface NewPackage4Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage4Factory eINSTANCE = codingExperimentOntology.apparatus.impl.NewPackage4FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coding Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding Artifact</em>'.
	 * @generated
	 */
	CodingArtifact createCodingArtifact();

	/**
	 * Returns a new object of class '<em>Resource Monitor Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Monitor Instrument</em>'.
	 * @generated
	 */
	ResourceMonitorInstrument createResourceMonitorInstrument();

	/**
	 * Returns a new object of class '<em>Time Monitor By Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Monitor By Resource</em>'.
	 * @generated
	 */
	TimeMonitorByResource createTimeMonitorByResource();

	/**
	 * Returns a new object of class '<em>Time Monitor By Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Monitor By Task</em>'.
	 * @generated
	 */
	TimeMonitorByTask createTimeMonitorByTask();

	/**
	 * Returns a new object of class '<em>Time Monitor By Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Monitor By Process</em>'.
	 * @generated
	 */
	TimeMonitorByProcess createTimeMonitorByProcess();

	/**
	 * Returns a new object of class '<em>Questionary By Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionary By Task</em>'.
	 * @generated
	 */
	QuestionaryByTask createQuestionaryByTask();

	/**
	 * Returns a new object of class '<em>Questionnaire By Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire By Process</em>'.
	 * @generated
	 */
	QuestionnaireByProcess createQuestionnaireByProcess();

	/**
	 * Returns a new object of class '<em>Question Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Content</em>'.
	 * @generated
	 */
	QuestionContent createQuestionContent();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NewPackage4Package getNewPackage4Package();

} //NewPackage4Factory
