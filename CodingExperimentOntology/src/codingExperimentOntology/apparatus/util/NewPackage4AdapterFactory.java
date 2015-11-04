/**
 */
package codingExperimentOntology.apparatus.util;

import codingExperimentOntology.apparatus.*;

import experimentOntology.planning.Apparatus;
import experimentOntology.planning.Artifact;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.apparatus.NewPackage4Package
 * @generated
 */
public class NewPackage4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewPackage4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewPackage4Switch<Adapter> modelSwitch =
		new NewPackage4Switch<Adapter>() {
			@Override
			public Adapter caseCodignApparatus(CodignApparatus object) {
				return createCodignApparatusAdapter();
			}
			@Override
			public Adapter caseCodingArtifact(CodingArtifact object) {
				return createCodingArtifactAdapter();
			}
			@Override
			public Adapter caseCodingInstrument(CodingInstrument object) {
				return createCodingInstrumentAdapter();
			}
			@Override
			public Adapter caseResourceMonitorInstrument(ResourceMonitorInstrument object) {
				return createResourceMonitorInstrumentAdapter();
			}
			@Override
			public Adapter caseTimeMonitorInstrument(TimeMonitorInstrument object) {
				return createTimeMonitorInstrumentAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseTimeMonitorByResource(TimeMonitorByResource object) {
				return createTimeMonitorByResourceAdapter();
			}
			@Override
			public Adapter caseTimeMonitorByTask(TimeMonitorByTask object) {
				return createTimeMonitorByTaskAdapter();
			}
			@Override
			public Adapter caseTimeMonitorByProcess(TimeMonitorByProcess object) {
				return createTimeMonitorByProcessAdapter();
			}
			@Override
			public Adapter caseTaskRelated(TaskRelated object) {
				return createTaskRelatedAdapter();
			}
			@Override
			public Adapter caseProcessRelated(ProcessRelated object) {
				return createProcessRelatedAdapter();
			}
			@Override
			public Adapter caseQuestionaryByTask(QuestionaryByTask object) {
				return createQuestionaryByTaskAdapter();
			}
			@Override
			public Adapter caseQuestionnaireByProcess(QuestionnaireByProcess object) {
				return createQuestionnaireByProcessAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseQuestionContent(QuestionContent object) {
				return createQuestionContentAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseApparatus(Apparatus object) {
				return createApparatusAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.CodignApparatus <em>Codign Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.CodignApparatus
	 * @generated
	 */
	public Adapter createCodignApparatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.CodingArtifact <em>Coding Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.CodingArtifact
	 * @generated
	 */
	public Adapter createCodingArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.CodingInstrument <em>Coding Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.CodingInstrument
	 * @generated
	 */
	public Adapter createCodingInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument <em>Resource Monitor Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.ResourceMonitorInstrument
	 * @generated
	 */
	public Adapter createResourceMonitorInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.TimeMonitorInstrument <em>Time Monitor Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.TimeMonitorInstrument
	 * @generated
	 */
	public Adapter createTimeMonitorInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.TimeMonitorByResource <em>Time Monitor By Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByResource
	 * @generated
	 */
	public Adapter createTimeMonitorByResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.TimeMonitorByTask <em>Time Monitor By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByTask
	 * @generated
	 */
	public Adapter createTimeMonitorByTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.TimeMonitorByProcess <em>Time Monitor By Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.TimeMonitorByProcess
	 * @generated
	 */
	public Adapter createTimeMonitorByProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.TaskRelated <em>Task Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.TaskRelated
	 * @generated
	 */
	public Adapter createTaskRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.ProcessRelated <em>Process Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.ProcessRelated
	 * @generated
	 */
	public Adapter createProcessRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.QuestionaryByTask <em>Questionary By Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.QuestionaryByTask
	 * @generated
	 */
	public Adapter createQuestionaryByTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.QuestionnaireByProcess <em>Questionnaire By Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.QuestionnaireByProcess
	 * @generated
	 */
	public Adapter createQuestionnaireByProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.QuestionContent <em>Question Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.QuestionContent
	 * @generated
	 */
	public Adapter createQuestionContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.apparatus.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.apparatus.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Apparatus <em>Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Apparatus
	 * @generated
	 */
	public Adapter createApparatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NewPackage4AdapterFactory
